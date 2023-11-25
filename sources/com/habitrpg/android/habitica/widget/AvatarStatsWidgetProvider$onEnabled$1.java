package com.habitrpg.android.habitica.widget;

import ad.k0;
import com.habitrpg.android.habitica.models.user.User;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: AvatarStatsWidgetProvider.kt */
@f(c = "com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider$onEnabled$1", f = "AvatarStatsWidgetProvider.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AvatarStatsWidgetProvider$onEnabled$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ AvatarStatsWidgetProvider this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarStatsWidgetProvider$onEnabled$1(AvatarStatsWidgetProvider avatarStatsWidgetProvider, Continuation<? super AvatarStatsWidgetProvider$onEnabled$1> continuation) {
        super(2, continuation);
        this.this$0 = avatarStatsWidgetProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarStatsWidgetProvider$onEnabled$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarStatsWidgetProvider$onEnabled$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            final AvatarStatsWidgetProvider avatarStatsWidgetProvider = this.this$0;
            h<? super User> hVar = new h() { // from class: com.habitrpg.android.habitica.widget.AvatarStatsWidgetProvider$onEnabled$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((User) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(User user2, Continuation<? super w> continuation) {
                    AvatarStatsWidgetProvider.this.user = user2;
                    AvatarStatsWidgetProvider.updateData$default(AvatarStatsWidgetProvider.this, null, 1, null);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (user.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
