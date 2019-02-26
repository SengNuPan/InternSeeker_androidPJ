package com.example.sengnupan.android_pj;

import java.security.acl.Permission;


class SimpleFacebookConfiguration {
    private SimpleFacebookConfiguration(Builder builder) {

    }


    public static class Builder {

        private String mAppId = null;

        private String mNamespace = null;

        // private List<String> mReadPermissions = new ArrayList<String>();

        // private List<String> mPublishPermissions = new ArrayList<String>();

        // private SessionDefaultAudience mDefaultAudience = SessionDefaultAudience.FRIENDS;

        // private SessionLoginBehavior mLoginBehavior = SessionLoginBehavior.SSO_WITH_FALLBACK;

        private boolean mAllAtOnce = false;

        private boolean mUseAppsecretProof = false;

        private String mAppSecret = null;



        public Builder() {

        }





        public Builder setAppId(String appId) {

            mAppId = appId;

            return this;

        }





        public Builder setNamespace(String namespace) {

            mNamespace = namespace;

            return this;

        }

        public void setPermissions(Permission[] permissions) {
            // this.permissions = permissions;
        }

        public SimpleFacebookConfiguration build() {

            return new SimpleFacebookConfiguration(this);

        }
    }

}

