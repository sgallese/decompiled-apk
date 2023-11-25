package com.habitrpg.android.habitica.widget;

import ad.k0;
import com.habitrpg.android.habitica.models.user.User;
import dc.n;
import dc.w;
import dd.g;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: AvatarStatsWidgetProvider.kt */
@f(c = "com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider$onUpdate$1", f = "AvatarStatsWidgetProvider.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AvatarStatsWidgetProvider$onUpdate$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ int[] $appWidgetIds;
    int label;
    final /* synthetic */ AvatarStatsWidgetProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarStatsWidgetProvider$onUpdate$1(AvatarStatsWidgetProvider avatarStatsWidgetProvider, int[] iArr, Continuation<? super AvatarStatsWidgetProvider$onUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = avatarStatsWidgetProvider;
        this.$appWidgetIds = iArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarStatsWidgetProvider$onUpdate$1(this.this$0, this.$appWidgetIds, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarStatsWidgetProvider$onUpdate$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            g<User> user = this.this$0.getUserRepository().getUser();
            this.label = 1;
            obj = i.x(user, this);
            if (obj == d10) {
                return d10;
            }
        }
        User user2 = (User) obj;
        if (user2 != null) {
            this.this$0.user = user2;
            this.this$0.updateData(this.$appWidgetIds);
            return w.f13270a;
        }
        return w.f13270a;
    }
}
