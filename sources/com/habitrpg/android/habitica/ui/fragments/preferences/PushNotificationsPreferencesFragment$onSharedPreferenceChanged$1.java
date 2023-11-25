package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: PushNotificationsPreferencesFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.PushNotificationsPreferencesFragment$onSharedPreferenceChanged$1", f = "PushNotificationsPreferencesFragment.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PushNotificationsPreferencesFragment$onSharedPreferenceChanged$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ String $pathKey;
    final /* synthetic */ SharedPreferences $sharedPreferences;
    int label;
    final /* synthetic */ PushNotificationsPreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsPreferencesFragment$onSharedPreferenceChanged$1(PushNotificationsPreferencesFragment pushNotificationsPreferencesFragment, String str, SharedPreferences sharedPreferences, String str2, Continuation<? super PushNotificationsPreferencesFragment$onSharedPreferenceChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = pushNotificationsPreferencesFragment;
        this.$pathKey = str;
        this.$sharedPreferences = sharedPreferences;
        this.$key = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PushNotificationsPreferencesFragment$onSharedPreferenceChanged$1(this.this$0, this.$pathKey, this.$sharedPreferences, this.$key, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PushNotificationsPreferencesFragment$onSharedPreferenceChanged$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            UserRepository userRepository = this.this$0.getUserRepository();
            String str = "preferences.pushNotifications." + this.$pathKey;
            Boolean a10 = kotlin.coroutines.jvm.internal.b.a(this.$sharedPreferences.getBoolean(this.$key, false));
            this.label = 1;
            if (userRepository.updateUser(str, a10, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
