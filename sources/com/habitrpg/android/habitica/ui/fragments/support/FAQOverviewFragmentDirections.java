package com.habitrpg.android.habitica.ui.fragments.support;

import android.os.Bundle;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FAQOverviewFragmentDirections {

    /* loaded from: classes4.dex */
    public static class OpenFAQDetail implements k3.k {
        private final HashMap arguments;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OpenFAQDetail openFAQDetail = (OpenFAQDetail) obj;
            if (this.arguments.containsKey("position") != openFAQDetail.arguments.containsKey("position") || getPosition() != openFAQDetail.getPosition() || this.arguments.containsKey("question") != openFAQDetail.arguments.containsKey("question")) {
                return false;
            }
            if (getQuestion() == null ? openFAQDetail.getQuestion() != null : !getQuestion().equals(openFAQDetail.getQuestion())) {
                return false;
            }
            if (this.arguments.containsKey("answer") != openFAQDetail.arguments.containsKey("answer")) {
                return false;
            }
            if (getAnswer() == null ? openFAQDetail.getAnswer() != null : !getAnswer().equals(openFAQDetail.getAnswer())) {
                return false;
            }
            if (getActionId() == openFAQDetail.getActionId()) {
                return true;
            }
            return false;
        }

        @Override // k3.k
        public int getActionId() {
            return R.id.openFAQDetail;
        }

        public String getAnswer() {
            return (String) this.arguments.get("answer");
        }

        @Override // k3.k
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.arguments.containsKey("position")) {
                bundle.putInt("position", ((Integer) this.arguments.get("position")).intValue());
            } else {
                bundle.putInt("position", 0);
            }
            if (this.arguments.containsKey("question")) {
                bundle.putString("question", (String) this.arguments.get("question"));
            }
            if (this.arguments.containsKey("answer")) {
                bundle.putString("answer", (String) this.arguments.get("answer"));
            }
            return bundle;
        }

        public int getPosition() {
            return ((Integer) this.arguments.get("position")).intValue();
        }

        public String getQuestion() {
            return (String) this.arguments.get("question");
        }

        public int hashCode() {
            int i10;
            int position = (getPosition() + 31) * 31;
            int i11 = 0;
            if (getQuestion() != null) {
                i10 = getQuestion().hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (position + i10) * 31;
            if (getAnswer() != null) {
                i11 = getAnswer().hashCode();
            }
            return ((i12 + i11) * 31) + getActionId();
        }

        public OpenFAQDetail setAnswer(String str) {
            this.arguments.put("answer", str);
            return this;
        }

        public OpenFAQDetail setPosition(int i10) {
            this.arguments.put("position", Integer.valueOf(i10));
            return this;
        }

        public OpenFAQDetail setQuestion(String str) {
            this.arguments.put("question", str);
            return this;
        }

        public String toString() {
            return "OpenFAQDetail(actionId=" + getActionId() + "){position=" + getPosition() + ", question=" + getQuestion() + ", answer=" + getAnswer() + "}";
        }

        private OpenFAQDetail(String str, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.put("question", str);
            hashMap.put("answer", str2);
        }
    }

    private FAQOverviewFragmentDirections() {
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

    public static OpenFAQDetail openFAQDetail(String str, String str2) {
        return new OpenFAQDetail(str, str2);
    }

    public static MainNavDirections.OpenProfileActivity openProfileActivity(String str) {
        return MainNavDirections.openProfileActivity(str);
    }
}
