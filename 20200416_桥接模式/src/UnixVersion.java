public class UnixVersion extends OperatingSystemVersion {
    @Override
    public void play(String fileName) {
        String osType = "Unix";
        vf.decode(osType,fileName);
    }
}
