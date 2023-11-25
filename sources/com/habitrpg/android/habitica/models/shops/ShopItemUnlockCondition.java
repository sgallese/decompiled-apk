package com.habitrpg.android.habitica.models.shops;

import android.content.Context;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.n4;
import qc.q;

/* compiled from: ShopItemUnlockCondition.kt */
/* loaded from: classes4.dex */
public class ShopItemUnlockCondition extends d1 implements BaseObject, n4 {
    public static final int $stable = 8;
    private String condition;
    private Integer incentiveThreshold;

    public ShopItemUnlockCondition() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Integer getIncentiveThreshold() {
        return realmGet$incentiveThreshold();
    }

    public final String readableUnlockCondition(Context context) {
        String string;
        q.i(context, "context");
        String realmGet$condition = realmGet$condition();
        if (realmGet$condition != null) {
            int hashCode = realmGet$condition.hashCode();
            if (hashCode != -384038135) {
                if (hashCode != -275689530) {
                    if (hashCode == 801017219 && realmGet$condition.equals("party invite")) {
                        String string2 = context.getString(R.string.party_invite);
                        q.h(string2, "getString(...)");
                        return string2;
                    }
                } else if (realmGet$condition.equals("login reward")) {
                    if (realmGet$incentiveThreshold() != null) {
                        string = context.getString(R.string.login_incentive_count, realmGet$incentiveThreshold());
                    } else {
                        string = context.getString(R.string.login_incentive);
                    }
                    q.f(string);
                    return string;
                }
            } else if (realmGet$condition.equals("create account")) {
                String string3 = context.getString(R.string.create_account);
                q.h(string3, "getString(...)");
                return string3;
            }
        }
        return "";
    }

    @Override // io.realm.n4
    public String realmGet$condition() {
        return this.condition;
    }

    @Override // io.realm.n4
    public Integer realmGet$incentiveThreshold() {
        return this.incentiveThreshold;
    }

    @Override // io.realm.n4
    public void realmSet$condition(String str) {
        this.condition = str;
    }

    @Override // io.realm.n4
    public void realmSet$incentiveThreshold(Integer num) {
        this.incentiveThreshold = num;
    }

    public final void setIncentiveThreshold(Integer num) {
        realmSet$incentiveThreshold(num);
    }

    public final String shortReadableUnlockCondition(Context context) {
        String string;
        q.i(context, "context");
        String realmGet$condition = realmGet$condition();
        if (realmGet$condition != null) {
            int hashCode = realmGet$condition.hashCode();
            if (hashCode != -384038135) {
                if (hashCode != -275689530) {
                    if (hashCode == 801017219 && realmGet$condition.equals("party invite")) {
                        String string2 = context.getString(R.string.party_invite_short);
                        q.h(string2, "getString(...)");
                        return string2;
                    }
                } else if (realmGet$condition.equals("login reward")) {
                    if (realmGet$incentiveThreshold() != null) {
                        string = context.getString(R.string.login_incentive_short_count, realmGet$incentiveThreshold());
                    } else {
                        string = context.getString(R.string.login_incentive_short);
                    }
                    q.f(string);
                    return string;
                }
            } else if (realmGet$condition.equals("create account")) {
                String string3 = context.getString(R.string.create_account_short);
                q.h(string3, "getString(...)");
                return string3;
            }
        }
        return "";
    }
}
