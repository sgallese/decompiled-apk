package com.habitrpg.android.habitica.ui.fragments.support;

import android.os.Bundle;
import androidx.lifecycle.n0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FAQDetailFragmentArgs implements k3.f {
    private final HashMap arguments;

    public static FAQDetailFragmentArgs fromBundle(Bundle bundle) {
        FAQDetailFragmentArgs fAQDetailFragmentArgs = new FAQDetailFragmentArgs();
        bundle.setClassLoader(FAQDetailFragmentArgs.class.getClassLoader());
        if (bundle.containsKey("position")) {
            fAQDetailFragmentArgs.arguments.put("position", Integer.valueOf(bundle.getInt("position")));
        } else {
            fAQDetailFragmentArgs.arguments.put("position", 0);
        }
        if (bundle.containsKey("question")) {
            fAQDetailFragmentArgs.arguments.put("question", bundle.getString("question"));
            if (bundle.containsKey("answer")) {
                fAQDetailFragmentArgs.arguments.put("answer", bundle.getString("answer"));
                return fAQDetailFragmentArgs;
            }
            throw new IllegalArgumentException("Required argument \"answer\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"question\" is missing and does not have an android:defaultValue");
    }

    public static FAQDetailFragmentArgs fromSavedStateHandle(n0 n0Var) {
        FAQDetailFragmentArgs fAQDetailFragmentArgs = new FAQDetailFragmentArgs();
        if (n0Var.e("position")) {
            fAQDetailFragmentArgs.arguments.put("position", Integer.valueOf(((Integer) n0Var.f("position")).intValue()));
        } else {
            fAQDetailFragmentArgs.arguments.put("position", 0);
        }
        if (n0Var.e("question")) {
            fAQDetailFragmentArgs.arguments.put("question", (String) n0Var.f("question"));
            if (n0Var.e("answer")) {
                fAQDetailFragmentArgs.arguments.put("answer", (String) n0Var.f("answer"));
                return fAQDetailFragmentArgs;
            }
            throw new IllegalArgumentException("Required argument \"answer\" is missing and does not have an android:defaultValue");
        }
        throw new IllegalArgumentException("Required argument \"question\" is missing and does not have an android:defaultValue");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FAQDetailFragmentArgs fAQDetailFragmentArgs = (FAQDetailFragmentArgs) obj;
        if (this.arguments.containsKey("position") != fAQDetailFragmentArgs.arguments.containsKey("position") || getPosition() != fAQDetailFragmentArgs.getPosition() || this.arguments.containsKey("question") != fAQDetailFragmentArgs.arguments.containsKey("question")) {
            return false;
        }
        if (getQuestion() == null ? fAQDetailFragmentArgs.getQuestion() != null : !getQuestion().equals(fAQDetailFragmentArgs.getQuestion())) {
            return false;
        }
        if (this.arguments.containsKey("answer") != fAQDetailFragmentArgs.arguments.containsKey("answer")) {
            return false;
        }
        if (getAnswer() == null ? fAQDetailFragmentArgs.getAnswer() == null : getAnswer().equals(fAQDetailFragmentArgs.getAnswer())) {
            return true;
        }
        return false;
    }

    public String getAnswer() {
        return (String) this.arguments.get("answer");
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
        return i12 + i11;
    }

    public Bundle toBundle() {
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

    public n0 toSavedStateHandle() {
        n0 n0Var = new n0();
        if (this.arguments.containsKey("position")) {
            n0Var.j("position", Integer.valueOf(((Integer) this.arguments.get("position")).intValue()));
        } else {
            n0Var.j("position", 0);
        }
        if (this.arguments.containsKey("question")) {
            n0Var.j("question", (String) this.arguments.get("question"));
        }
        if (this.arguments.containsKey("answer")) {
            n0Var.j("answer", (String) this.arguments.get("answer"));
        }
        return n0Var;
    }

    public String toString() {
        return "FAQDetailFragmentArgs{position=" + getPosition() + ", question=" + getQuestion() + ", answer=" + getAnswer() + "}";
    }

    private FAQDetailFragmentArgs() {
        this.arguments = new HashMap();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final HashMap arguments;

        public Builder(FAQDetailFragmentArgs fAQDetailFragmentArgs) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.putAll(fAQDetailFragmentArgs.arguments);
        }

        public FAQDetailFragmentArgs build() {
            return new FAQDetailFragmentArgs(this.arguments);
        }

        public String getAnswer() {
            return (String) this.arguments.get("answer");
        }

        public int getPosition() {
            return ((Integer) this.arguments.get("position")).intValue();
        }

        public String getQuestion() {
            return (String) this.arguments.get("question");
        }

        public Builder setAnswer(String str) {
            this.arguments.put("answer", str);
            return this;
        }

        public Builder setPosition(int i10) {
            this.arguments.put("position", Integer.valueOf(i10));
            return this;
        }

        public Builder setQuestion(String str) {
            this.arguments.put("question", str);
            return this;
        }

        public Builder(String str, String str2) {
            HashMap hashMap = new HashMap();
            this.arguments = hashMap;
            hashMap.put("question", str);
            hashMap.put("answer", str2);
        }
    }

    private FAQDetailFragmentArgs(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.arguments = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
