package com.habitrpg.android.habitica.prefs;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import qc.h;
import qc.q;

/* compiled from: TimePreference.kt */
/* loaded from: classes4.dex */
public final class TimePreference extends DialogPreference {
    private String timeval;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TimePreference.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        
            r9 = yc.w.x0(r9, new java.lang.String[]{":"}, false, 0, 6, null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int getHour(java.lang.String r9) {
            /*
                r8 = this;
                r0 = 0
                if (r9 == 0) goto L20
                java.lang.String r1 = ":"
                java.lang.String[] r3 = new java.lang.String[]{r1}
                r4 = 0
                r5 = 0
                r6 = 6
                r7 = 0
                r2 = r9
                java.util.List r9 = yc.m.x0(r2, r3, r4, r5, r6, r7)
                if (r9 == 0) goto L20
                java.lang.Object r9 = r9.get(r0)
                java.lang.String r9 = (java.lang.String) r9
                if (r9 == 0) goto L20
                int r0 = java.lang.Integer.parseInt(r9)
            L20:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.prefs.TimePreference.Companion.getHour(java.lang.String):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
        
            r8 = yc.w.x0(r8, new java.lang.String[]{":"}, false, 0, 6, null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int getMinute(java.lang.String r8) {
            /*
                r7 = this;
                if (r8 == 0) goto L21
                java.lang.String r0 = ":"
                java.lang.String[] r2 = new java.lang.String[]{r0}
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r8
                java.util.List r8 = yc.m.x0(r1, r2, r3, r4, r5, r6)
                if (r8 == 0) goto L21
                r0 = 1
                java.lang.Object r8 = r8.get(r0)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L21
                int r8 = java.lang.Integer.parseInt(r8)
                goto L22
            L21:
                r8 = 0
            L22:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.prefs.TimePreference.Companion.getMinute(java.lang.String):int");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "ctxt");
        setPositiveButtonText("Set");
        setNegativeButtonText("Cancel");
    }

    public final int getLastHour() {
        return Companion.getHour(this.timeval);
    }

    public final int getLastMinute() {
        return Companion.getMinute(this.timeval);
    }

    public final String getText() {
        return this.timeval;
    }

    @Override // androidx.preference.Preference
    protected Object onGetDefaultValue(TypedArray typedArray, int i10) {
        q.i(typedArray, "a");
        String string = typedArray.getString(i10);
        q.f(string);
        return string;
    }

    @Override // androidx.preference.Preference
    protected void onSetInitialValue(Object obj) {
        String persistedString;
        this.timeval = null;
        if (obj == null) {
            persistedString = getPersistedString("19:00");
        } else {
            persistedString = getPersistedString(obj.toString());
        }
        this.timeval = persistedString;
        if (persistedString == null) {
            persistedString = "";
        }
        setSummary(persistedString);
    }

    @Override // androidx.preference.Preference
    public void setSummary(CharSequence charSequence) {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        Companion companion = Companion;
        calendar.set(11, companion.getHour(this.timeval));
        calendar.set(12, companion.getMinute(this.timeval));
        super.setSummary(DateFormat.getTimeInstance(3).format(calendar.getTime()));
    }

    public final void setText(String str) {
        boolean shouldDisableDependents = shouldDisableDependents();
        this.timeval = str;
        persistString(str);
        boolean shouldDisableDependents2 = shouldDisableDependents();
        if (shouldDisableDependents2 != shouldDisableDependents) {
            notifyDependencyChange(shouldDisableDependents2);
        }
    }
}
