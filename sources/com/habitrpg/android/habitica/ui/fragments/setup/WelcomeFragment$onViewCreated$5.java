package com.habitrpg.android.habitica.ui.fragments.setup;

import ad.k0;
import android.widget.EditText;
import com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding;
import com.habitrpg.android.habitica.models.auth.LocalAuthentication;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.User;
import dc.n;
import dc.w;
import dd.g;
import dd.i;
import dd.x;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: WelcomeFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$5", f = "WelcomeFragment.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WelcomeFragment$onViewCreated$5 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ WelcomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$5(WelcomeFragment welcomeFragment, Continuation<? super WelcomeFragment$onViewCreated$5> continuation) {
        super(2, continuation);
        this.this$0 = welcomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new WelcomeFragment$onViewCreated$5(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((WelcomeFragment$onViewCreated$5) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        x xVar;
        String str;
        x xVar2;
        String username;
        EditText editText;
        Authentication authentication;
        LocalAuthentication localAuthentication;
        Profile profile;
        EditText editText2;
        String str2;
        Profile profile2;
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
            g<User> user = this.this$0.getUserRepository().getUser();
            this.label = 1;
            obj = i.x(user, this);
            if (obj == d10) {
                return d10;
            }
        }
        User user2 = (User) obj;
        FragmentWelcomeBinding binding = this.this$0.getBinding();
        String str3 = null;
        if (binding != null && (editText2 = binding.displayNameEditText) != null) {
            if (user2 != null && (profile2 = user2.getProfile()) != null) {
                str2 = profile2.getName();
            } else {
                str2 = null;
            }
            editText2.setText(str2);
        }
        xVar = this.this$0.displayNameVerificationEvents;
        String str4 = "";
        if (user2 == null || (profile = user2.getProfile()) == null || (str = profile.getName()) == null) {
            str = "";
        }
        xVar.setValue(str);
        FragmentWelcomeBinding binding2 = this.this$0.getBinding();
        if (binding2 != null && (editText = binding2.usernameEditText) != null) {
            if (user2 != null && (authentication = user2.getAuthentication()) != null && (localAuthentication = authentication.getLocalAuthentication()) != null) {
                str3 = localAuthentication.getUsername();
            }
            editText.setText(str3);
        }
        xVar2 = this.this$0.usernameVerificationEvents;
        if (user2 != null && (username = user2.getUsername()) != null) {
            str4 = username;
        }
        xVar2.setValue(str4);
        return w.f13270a;
    }
}
