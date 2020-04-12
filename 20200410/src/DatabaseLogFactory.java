public class DatabaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new DatbaseLog();
    }
}
