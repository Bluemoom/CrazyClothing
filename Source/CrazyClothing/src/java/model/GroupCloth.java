/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sunny
 */
public class GroupCloth {
    private String groupID;
    public String groupName;
    private String image;
    private String groupTop;

    public GroupCloth() {
    }

    public GroupCloth(String groupID, String groupName, String image, String groupTop) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.image = image;
        this.groupTop = groupTop;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGroupTop() {
        return groupTop;
    }

    public void setGroupTop(String groupTop) {
        this.groupTop = groupTop;
    }
    
    
    
}
