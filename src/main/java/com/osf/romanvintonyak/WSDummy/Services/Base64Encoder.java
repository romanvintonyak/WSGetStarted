package com.osf.romanvintonyak.WSDummy.Services;

import org.apache.commons.codec.binary.Base64;

import javax.ejb.Stateless;
import java.math.BigInteger;

@Stateless
public class Base64Encoder {

    public static String encodeToBase64(long id){
        return Base64.encodeBase64String(BigInteger.valueOf(id).toByteArray());
    }
}
