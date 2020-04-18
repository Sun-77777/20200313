
//EncryptFacade外观类，也是整个外观模式的核心，
//它与子系统之间具有关联关系，在外观类中可以调用子系统对象的方法
public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    public void fileEncrypt(String fileNameSrc,String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr,fileNameDes);
    }
}
