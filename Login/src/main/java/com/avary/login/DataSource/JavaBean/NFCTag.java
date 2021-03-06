package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NFCTag {

    @SerializedName("tags")
    private List<Tags> tags;

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public static class Tags {
        @SerializedName("machine")
        private String machine;
        @SerializedName("nfctag")
        private String nfctag;

        public Tags(String machine, String nfctag) {
            this.machine = machine;
            this.nfctag = nfctag;
        }

        public String getMachine() {
            return machine;
        }

        public void setMachine(String machine) {
            this.machine = machine;
        }

        public String getNfctag() {
            return nfctag;
        }

        public void setNfctag(String nfctag) {
            this.nfctag = nfctag;
        }
    }
}
