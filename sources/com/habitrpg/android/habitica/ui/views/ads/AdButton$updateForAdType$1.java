package com.habitrpg.android.habitica.ui.views.ads;

import ad.k0;
import ad.u0;
import com.habitrpg.android.habitica.extensions.DateExtensionsKt;
import com.habitrpg.android.habitica.ui.views.ads.AdButton;
import dc.n;
import dc.w;
import ic.d;
import java.util.Date;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import zc.a;
import zc.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdButton.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.ads.AdButton$updateForAdType$1", f = "AdButton.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class AdButton$updateForAdType$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ AdButton this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdButton$updateForAdType$1(AdButton adButton, Continuation<? super AdButton$updateForAdType$1> continuation) {
        super(2, continuation);
        this.this$0 = adButton;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AdButton$updateForAdType$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AdButton$updateForAdType$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Date date;
        Date date2;
        long j10;
        AdButton.State state;
        long o10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        n.b(obj);
        do {
            date = this.this$0.nextAdDate;
            boolean z10 = false;
            if (date != null && date.after(new Date())) {
                z10 = true;
            }
            if (z10) {
                date2 = this.this$0.nextAdDate;
                if (date2 != null) {
                    j10 = date2.getTime();
                } else {
                    j10 = 0;
                }
                long p10 = c.p(j10 - new Date().getTime(), zc.d.MILLISECONDS);
                AdButton adButton = this.this$0;
                if (a.D(p10)) {
                    state = AdButton.State.READY;
                } else {
                    state = AdButton.State.UNAVAILABLE;
                }
                adButton.setState(state);
                this.this$0.updateViews();
                o10 = c.o(1, DateExtensionsKt.m5getMinuteOrSecondsLRDsOJo(p10));
                this.label = 1;
            } else {
                this.this$0.setState(AdButton.State.READY);
                return w.f13270a;
            }
        } while (u0.b(o10, this) != d10);
        return d10;
    }
}
