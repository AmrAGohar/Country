/*
@author: agohar
since : 6/18/2019
*/
package hello.model;

public class BasicModel {
    private String replyMessage="success";
    private int replyCode=200;

    public String getReplyMessage() {
        return replyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        this.replyMessage = replyMessage;
    }

    public int getReplyCode() {
        return replyCode;
    }

    public void setReplyCode(int replyCode) {
        this.replyCode = replyCode;
    }
}
