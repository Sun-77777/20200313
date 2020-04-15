public class WindowsVersion extends OperatingSystemVersion {

    @Override
    public void play(String fileName) {
        String osType = "Windows";
        vf.decode(osType,fileName);
    }
}
