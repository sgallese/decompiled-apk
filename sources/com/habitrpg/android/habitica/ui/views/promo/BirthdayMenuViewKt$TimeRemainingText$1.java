package com.habitrpg.android.habitica.ui.views.promo;

import ad.k0;
import ad.l0;
import ad.u0;
import dc.n;
import dc.w;
import ic.d;
import j0.j1;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import zc.a;
import zc.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BirthdayMenuView.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.promo.BirthdayMenuViewKt$TimeRemainingText$1", f = "BirthdayMenuView.kt", l = {152, 156}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class BirthdayMenuViewKt$TimeRemainingText$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Date $endDate;
    final /* synthetic */ j1<Integer> $value$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayMenuViewKt$TimeRemainingText$1(Date date, j1<Integer> j1Var, Continuation<? super BirthdayMenuViewKt$TimeRemainingText$1> continuation) {
        super(2, continuation);
        this.$endDate = date;
        this.$value$delegate = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        BirthdayMenuViewKt$TimeRemainingText$1 birthdayMenuViewKt$TimeRemainingText$1 = new BirthdayMenuViewKt$TimeRemainingText$1(this.$endDate, this.$value$delegate, continuation);
        birthdayMenuViewKt$TimeRemainingText$1.L$0 = obj;
        return birthdayMenuViewKt$TimeRemainingText$1;
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BirthdayMenuViewKt$TimeRemainingText$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        int TimeRemainingText_mhOCef0$lambda$7;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            k0 k0Var = (k0) this.L$0;
            long time = this.$endDate.getTime() - new Date().getTime();
            a.C0609a c0609a = zc.a.f26431m;
            if (zc.a.j(c.p(time, zc.d.MILLISECONDS), c.o(1, zc.d.HOURS)) > 0) {
                long o10 = c.o(1, zc.d.MINUTES);
                this.label = 1;
                if (u0.b(o10, this) == d10) {
                    return d10;
                }
            } else if (time < 0) {
                l0.d(k0Var, null, 1, null);
            } else {
                long o11 = c.o(1, zc.d.SECONDS);
                this.label = 2;
                if (u0.b(o11, this) == d10) {
                    return d10;
                }
            }
        }
        j1<Integer> j1Var = this.$value$delegate;
        TimeRemainingText_mhOCef0$lambda$7 = BirthdayMenuViewKt.TimeRemainingText_mhOCef0$lambda$7(j1Var);
        BirthdayMenuViewKt.TimeRemainingText_mhOCef0$lambda$8(j1Var, TimeRemainingText_mhOCef0$lambda$7 + 1);
        return w.f13270a;
    }
}
