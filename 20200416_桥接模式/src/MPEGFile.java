public class MPEGFile implements VideoFile{
    @Override
    public void decode(String osType, String fileName) {
        System.out.println(osType + "上播放" + fileName + "格式的六级听力文件！");
    }
}
