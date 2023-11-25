package com.habitrpg.android.habitica.models.user.auth;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.f8;
import io.realm.internal.o;
import io.realm.x0;
import qc.q;

/* compiled from: SocialAuthentication.kt */
/* loaded from: classes4.dex */
public class SocialAuthentication extends d1 implements BaseObject, f8 {
    public static final int $stable = 8;
    private x0<String> emails;

    public SocialAuthentication() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$emails(new x0());
    }

    public final x0<String> getEmails() {
        return realmGet$emails();
    }

    @Override // io.realm.f8
    public x0 realmGet$emails() {
        return this.emails;
    }

    @Override // io.realm.f8
    public void realmSet$emails(x0 x0Var) {
        this.emails = x0Var;
    }

    public final void setEmails(x0<String> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$emails(x0Var);
    }
}
