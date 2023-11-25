package com.habitrpg.android.habitica.ui.fragments.social;

import android.os.Bundle;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;
import java.util.HashMap;
import k3.k;

/* loaded from: classes4.dex */
public class InboxOverviewFragmentDirections {

    /* loaded from: classes4.dex */
    public static class OpenInboxDetail implements k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenInboxDetail openInboxDetail = (OpenInboxDetail) obj;
            if (this.arguments.containsKey("userID") != openInboxDetail.arguments.containsKey("userID")) {
                return false;
            }
            if (getUserID() == null ? openInboxDetail.getUserID() != null : !getUserID().equals(openInboxDetail.getUserID())) {
                return false;
            }
            if (this.arguments.containsKey("username") != openInboxDetail.arguments.containsKey("username")) {
                return false;
            }
            if (getUsername() == null ? openInboxDetail.getUsername() != null : !getUsername().equals(openInboxDetail.getUsername())) {
                return false;
            }
            if (getActionId() == openInboxDetail.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openInboxDetail;
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("userID")) {
                bundle.putString("userID", (String) this.arguments.get("userID"));
            }
            if (this.arguments.containsKey("username")) {
                bundle.putString("username", (String) this.arguments.get("username"));
            }
            return bundle;
        }

        public String getUserID() {
            return (String) this.arguments.get("userID");
        }

        public String getUsername() {
            return (String) this.arguments.get("username");
        }

        public int hashCode() {
            int i10;
            int i11 = 0;
            if (getUserID() != null) {
                i10 = getUserID().hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (i10 + 31) * 31;
            if (getUsername() != null) {
                i11 = getUsername().hashCode();
            }
            return ((i12 + i11) * 31) + getActionId();
        }

        public OpenInboxDetail setUserID(String str) {
            if (str != null) {
                this.arguments.put("userID", str);
                return this;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }

        public OpenInboxDetail setUsername(String str) {
            this.arguments.put("username", str);
            return this;
        }

        public String toString() {
            return "OpenInboxDetail(actionId=" + getActionId() + "){userID=" + getUserID() + ", username=" + getUsername() + "}";
        }

        private OpenInboxDetail(String str, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            if (str != null) {
                hashMap.put("userID", str);
                hashMap.put("username", str2);
                return;
            }
            throw new IllegalArgumentException("Argument \"userID\" is marked as non-null but was passed a null value.");
        }
    }

    private InboxOverviewFragmentDirections() {
    }

    public static MainNavDirections.ActionGlobalClassSelectionActivity actionGlobalClassSelectionActivity() {
        return MainNavDirections.actionGlobalClassSelectionActivity();
    }

    public static MainNavDirections.ActionGlobalReportMessageActivity actionGlobalReportMessageActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.actionGlobalReportMessageActivity(str, str2, str3, str4);
    }

    public static MainNavDirections.OpenArmoireActivity openArmoireActivity(String str, String str2, String str3, String str4) {
        return MainNavDirections.openArmoireActivity(str, str2, str3, str4);
    }

    public static OpenInboxDetail openInboxDetail(String str, String str2) {
        return new OpenInboxDetail(str, str2);
    }

    public static MainNavDirections.OpenProfileActivity openProfileActivity(String str) {
        return MainNavDirections.openProfileActivity(str);
    }
}
