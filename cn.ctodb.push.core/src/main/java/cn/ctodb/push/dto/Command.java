package cn.ctodb.push.dto;

public enum Command {
    HEARTBEAT(1),
    HANDSHAKE_REQ(10),
    HANDSHAKE_RESP(11),
    ERROR(2),
    LOGIN(3),
    LOGOUT(4),
    BIND(5),
    UNBIND(6),
    PUSH(7),
    TEXT_MESSAGE(100),
    UNKNOWN(-1);

    Command(int cmd) {
        this.cmd = (byte) cmd;
    }

    public final byte cmd;

    public static Command toCMD(byte b) {
        for (Command command : values()) {
            if (command.cmd == b) {
                return command;
            }
        }
        return UNKNOWN;
    }

}
