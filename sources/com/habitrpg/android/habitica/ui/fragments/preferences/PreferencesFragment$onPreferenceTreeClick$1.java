package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.views.preferences.PauseResumeDamageViewKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import pc.q;
import qc.r;

/* compiled from: PreferencesFragment.kt */
/* loaded from: classes4.dex */
final class PreferencesFragment$onPreferenceTreeClick$1 extends r implements q<pc.a<? extends w>, j0.l, Integer, w> {
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreferencesFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$onPreferenceTreeClick$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.a<w> {
        final /* synthetic */ pc.a<w> $dismiss;
        final /* synthetic */ PreferencesFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PreferencesFragment.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$onPreferenceTreeClick$1$1$1", f = "PreferencesFragment.kt", l = {146}, m = "invokeSuspend")
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$onPreferenceTreeClick$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02841 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
            final /* synthetic */ pc.a<w> $dismiss;
            int label;
            final /* synthetic */ PreferencesFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02841(PreferencesFragment preferencesFragment, pc.a<w> aVar, Continuation<? super C02841> continuation) {
                super(2, continuation);
                this.this$0 = preferencesFragment;
                this.$dismiss = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C02841(this.this$0, this.$dismiss, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C02841) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    User user$Habitica_2311256681_prodRelease = this.this$0.getUser$Habitica_2311256681_prodRelease();
                    if (user$Habitica_2311256681_prodRelease != null) {
                        UserRepository userRepository = this.this$0.getUserRepository();
                        this.label = 1;
                        obj = userRepository.sleep(user$Habitica_2311256681_prodRelease, this);
                        if (obj == d10) {
                            return d10;
                        }
                    }
                    this.$dismiss.invoke();
                    return w.f13270a;
                }
                User user = (User) obj;
                this.$dismiss.invoke();
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PreferencesFragment preferencesFragment, pc.a<w> aVar) {
            super(0);
            this.this$0 = preferencesFragment;
            this.$dismiss = aVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new C02841(this.this$0, this.$dismiss, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$onPreferenceTreeClick$1(PreferencesFragment preferencesFragment) {
        super(3);
        this.this$0 = preferencesFragment;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(pc.a<? extends w> aVar, j0.l lVar, Integer num) {
        invoke((pc.a<w>) aVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(pc.a<w> aVar, j0.l lVar, int i10) {
        Preferences preferences;
        qc.q.i(aVar, "dismiss");
        if ((i10 & 14) == 0) {
            i10 |= lVar.l(aVar) ? 4 : 2;
        }
        if ((i10 & 91) == 18 && lVar.t()) {
            lVar.z();
            return;
        }
        if (j0.n.K()) {
            j0.n.V(-1899727427, i10, -1, "com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment.onPreferenceTreeClick.<anonymous> (PreferencesFragment.kt:143)");
        }
        User user$Habitica_2311256681_prodRelease = this.this$0.getUser$Habitica_2311256681_prodRelease();
        PauseResumeDamageViewKt.PauseResumeDamageView((user$Habitica_2311256681_prodRelease == null || (preferences = user$Habitica_2311256681_prodRelease.getPreferences()) == null) ? true : preferences.getSleep(), new AnonymousClass1(this.this$0, aVar), null, lVar, 0, 4);
        if (j0.n.K()) {
            j0.n.U();
        }
    }
}
