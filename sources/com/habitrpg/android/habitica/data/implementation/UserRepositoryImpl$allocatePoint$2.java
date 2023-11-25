package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.tasks.Attribute;
import dc.w;
import io.realm.o0;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class UserRepositoryImpl$allocatePoint$2 extends r implements l<o0, w> {
    final /* synthetic */ User $liveUser;
    final /* synthetic */ Attribute $stat;

    /* compiled from: UserRepositoryImpl.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Attribute.values().length];
            try {
                iArr[Attribute.STRENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Attribute.INTELLIGENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Attribute.CONSTITUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Attribute.PERCEPTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$allocatePoint$2(Attribute attribute, User user) {
        super(1);
        this.$stat = attribute;
        this.$liveUser = user;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        Integer strength;
        Integer points;
        Integer intelligence;
        Integer constitution;
        Stats stats;
        Integer per;
        q.i(o0Var, "it");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.$stat.ordinal()];
        Integer num = null;
        if (i10 == 1) {
            Stats stats2 = this.$liveUser.getStats();
            if (stats2 != null) {
                Stats stats3 = this.$liveUser.getStats();
                stats2.setStrength((stats3 == null || (strength = stats3.getStrength()) == null) ? null : Integer.valueOf(strength.intValue() + 1));
            }
        } else if (i10 == 2) {
            Stats stats4 = this.$liveUser.getStats();
            if (stats4 != null) {
                Stats stats5 = this.$liveUser.getStats();
                stats4.setIntelligence((stats5 == null || (intelligence = stats5.getIntelligence()) == null) ? null : Integer.valueOf(intelligence.intValue() + 1));
            }
        } else if (i10 == 3) {
            Stats stats6 = this.$liveUser.getStats();
            if (stats6 != null) {
                Stats stats7 = this.$liveUser.getStats();
                stats6.setConstitution((stats7 == null || (constitution = stats7.getConstitution()) == null) ? null : Integer.valueOf(constitution.intValue() + 1));
            }
        } else if (i10 == 4 && (stats = this.$liveUser.getStats()) != null) {
            Stats stats8 = this.$liveUser.getStats();
            stats.setPer((stats8 == null || (per = stats8.getPer()) == null) ? null : Integer.valueOf(per.intValue() + 1));
        }
        Stats stats9 = this.$liveUser.getStats();
        if (stats9 == null) {
            return;
        }
        Stats stats10 = this.$liveUser.getStats();
        if (stats10 != null && (points = stats10.getPoints()) != null) {
            num = Integer.valueOf(points.intValue() - 1);
        }
        stats9.setPoints(num);
    }
}
