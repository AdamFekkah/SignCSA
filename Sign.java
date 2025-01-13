public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        if (message.isEmpty()) {
            return 0;
        }
        return (message.length() + width - 1) / width;
    }

    public String getLines() {
        if (message.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int totalLines = numberOfLines();
        for (int i = 0; i < totalLines; i++) {
            int start = i * width;
            int end = Math.min(start + width, message.length());
            sb.append(message.substring(start, end));
            if (i < totalLines - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
