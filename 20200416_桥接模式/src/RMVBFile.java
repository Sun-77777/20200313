public class RMVBFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println(osType + "上播放" + fileName + "格式的喜洋洋与灰太狼文件！");
    }
}
