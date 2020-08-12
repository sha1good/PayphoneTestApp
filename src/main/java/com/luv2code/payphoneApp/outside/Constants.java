package com.luv2code.payphoneApp.outside;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constants {

   //public static final String BASE_URL = "https://sandbox.interswitchng.com/api/v1/verve/wallet/subscribers/";

    public static final String BASE_URL = "http://172.35.2.5:9080/api/v1/verve/wallet/subscribers/";
    public static final String TIMESTAMP = "TIMESTAMP";
    public static final String NONCE = "NONCE";
    public static final String SIGNATURE_METHOD = "SIGNATURE_METHOD";
    public static final String SIGNATURE = "SIGNATURE";
    public static final String AUTHORIZATION = "AUTHORIZATION";

    public static final String CLIENT_ID = {ClientID} // replace with your clientID or test clientID
    public static final String CLIENT_SECRET = {{clientSecret}} // Replace with your clinet Secret
 //"QTMOBILE1WALSIS"
     

    public static final String  SCHEME = "webpay"; //"webpay"; //"EPG";
    public static final String  CHANNEL = "quicktellermobile";
    public static final String  MERCHANTID = "QTMOBILE1ISWPIS"; //"QTMOBILE1ISWPIS";  //"QTMOBILE1EPPIGY";
    public static final String  VERSION = "5.0";

    public static final String AUTHORIZATION_REALM = "InterswitchAuth";
    public  static final String ISO_8859_1 = "ISO-8859-1";

    /*public final  static Map<String,String>  paymentMethodTypeCode = new HashMap<String,String>(){
        {
            put("MCC","MasterCard");
            put("VCC","VisaCard");
            put("VVC","VerveCard");
        }

    };

    public final static List<String> paymentMethodCode = new ArrayList<>(paymentMethodTypeCode.keySet());
    public final static List<String> paymentMethodName = new ArrayList<>(paymentMethodTypeCode.values());

    public final static  Map<String,String> paymentMethodCodes = new HashMap<String, String>(){
        {
            put("CBP","Stanbic Bank");
            put("UBA","UBA Bank");
            put("KBL","Keystone Bank");
            put("ABP","Access Bank");
        }
    };

    public  final  static List<String> paymentMetCodes = new ArrayList<>(paymentMethodCodes.keySet());
    public  final  static List<String> paymentMetNames = new ArrayList<>(paymentMethodCodes.values());*/
}
