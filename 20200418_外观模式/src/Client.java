
//在Client 类中定义了EncryptFacade外观类的对象encryptFacade，
//通过调用该对象的方法间接实现对子系统类的操作。

public class Client {
    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt("c盘视频文件","d盘学习文件");
    }
}
