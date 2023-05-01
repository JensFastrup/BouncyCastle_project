import java.security.Provider;
import java.security.Security;

/**
 * steps.
 * using Java 1.8.
 * 1. download bcprov-ext.jdk18on-173.jar from https://www.bouncycastle.org/latest_releases.html
 * as in this example https://makeinjava.com/install-bouncy-castle-provider-configuring-java-runtime-example/
 * add the .jar to classpath. you should be able to see it under "External Libraries, to the right".
 * locate your jdk-installation, and find java.security.
 * there add  BouncyCastleProvider as
 * <security.provider.11=org.bouncycastle.jce.provider.BouncyCastleProvider>
 *
 * The output when running this should be.
 *
 * Provider Name :BC
 * Provider Version :1.73
 * Provider Info:BouncyCastle Security Provider v1.73
 * **/


public class BouncyCastleDemo {
    public static void main(String[] args) {
        String providerName = "BC";
        Provider provider = Security.getProvider(providerName);
        if (provider == null) {
            System.out.println(providerName + " provider not installed");
            return;
        }

        System.out.println("Provider Name :"+ provider.getName());
        System.out.println("Provider Version :"+ provider.getVersion());
        System.out.println("Provider Info:" + provider.getInfo());
    }
}