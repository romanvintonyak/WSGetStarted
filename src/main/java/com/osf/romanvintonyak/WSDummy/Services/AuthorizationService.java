package com.osf.romanvintonyak.WSDummy.Services;

/**
 * Created by Roman on 21.05.2015.
 */

import com.osf.romanvintonyak.WSDummy.Entities.User;
import com.osf.romanvintonyak.WSDummy.dao.UserDao;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.ArrayList;
import java.util.Map;

import static javax.xml.bind.DatatypeConverter.parseBase64Binary;

@Stateless
public class AuthorizationService {

    private static final String AUTHORIZATION = "Authorization";
    private static final String AUTHORIZATION_TYPE = "Basic";
    private static final String DELIMITER = ":";

    @EJB
    UserDao userDao;


    public User getGetUserFromHeader(WebServiceContext context) {
        MessageContext mctx = context.getMessageContext();
        //get detail from request headers
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);

        ArrayList authorizationList = (ArrayList) http_headers.get(AUTHORIZATION);
        String authorization = authorizationList != null ? (String) authorizationList.get(0) : null;
        if (authorization != null && authorization.startsWith(AUTHORIZATION_TYPE)) {

            // Authorization: Basic base64credentials
            String base64Credentials = authorization.substring(AUTHORIZATION_TYPE.length()).trim();
            String credentials = new String(parseBase64Binary(base64Credentials));

            // credentials = username:password
            String[] credentialsArray = credentials.split(DELIMITER, 2);

            String username = credentialsArray[0];
            String password = credentialsArray[1];
            return new User(username, password);
        }
        return null;
    }

    public boolean isAuthorized(User user) {
        return userDao.checkUser(user);
    }


}
