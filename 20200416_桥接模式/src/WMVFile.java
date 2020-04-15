public class WMVFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println(osType + "上播放" + fileName + "格式的两世欢文件！");
    }
}
