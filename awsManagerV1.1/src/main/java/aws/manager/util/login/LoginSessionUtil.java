package aws.manager.util.login;

import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.s3.AmazonS3;

public class LoginSessionUtil {

    private static LoginSessionUtil LoginSession=new LoginSessionUtil();
    
    private LoginSessionUtil(){};
    
    public static synchronized LoginSessionUtil getLoginSession() {
        return LoginSession;        
    }
    
    //MainController 첫 로드시 기본으로 로드될 공개키
    private String scAccessBaseKeyText= "";
    //MainController 첫 로드시 기본으로 로드될 암호키
    private String scSecurityBaseKeyText= "";
    
    private AmazonEC2 EC2ClientSession = null;
    private AmazonS3 S3ClientSession = null;
    
    public String getScAccessBaseKeyText() {
        return scAccessBaseKeyText;
    }
    public String getScSecurityBaseKeyText() {
        return scSecurityBaseKeyText;
    }

    public AmazonEC2 getEC2ClientSession() {
        return EC2ClientSession;
    }

    public void setEC2ClientSession(AmazonEC2 eC2ClientSession) {
        EC2ClientSession = eC2ClientSession;
    }

    public AmazonS3 getS3ClientSession() {
        return S3ClientSession;
    }

    public void setS3ClientSession(AmazonS3 s3ClientSession) {
        S3ClientSession = s3ClientSession;
    }  
    
}
