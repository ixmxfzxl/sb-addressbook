//package com.bridgelabz.addressbook.util;
//
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.JWTVerifier;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.exceptions.JWTCreationException;
//import com.auth0.jwt.interfaces.Claim;
//import com.auth0.jwt.interfaces.DecodedJWT;
//import com.auth0.jwt.interfaces.Verification;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UToken {
//    public  final String TOKEN = "Afzal";
//
//    public  String generateToken(Long id)   {
//        try {
//            Algorithm algorithm = Algorithm.HMAC256(TOKEN);
//
//            String token = JWT.create()
//                    .withClaim("user_id", id)
//                    .sign(algorithm);
//            return token;
//        } catch (JWTCreationException exception) {
//            exception.printStackTrace();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public Long decodeToken(String token) {
//        Long userid;
//        Verification verification = null;
//        try {
//            verification = JWT.require(Algorithm.HMAC256(TOKEN));
//        } catch (IllegalArgumentException  e) {
//            e.printStackTrace();
//        }
//        JWTVerifier jwtverifier=verification.build();
//        DecodedJWT decodedjwt=jwtverifier.verify(token);
//
//        Claim claim=decodedjwt.getClaim("user_id");
//        userid=claim.asLong();
//        return userid;
//    }
//}
