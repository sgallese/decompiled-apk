package com.habitrpg.android.habitica.ui.fragments.setup;

import ad.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding;
import com.habitrpg.android.habitica.extensions.OnChangeTextWatcher;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.f;
import dc.h;
import dc.w;
import dd.n0;
import dd.x;
import pc.l;
import qc.q;

/* compiled from: WelcomeFragment.kt */
/* loaded from: classes4.dex */
public final class WelcomeFragment extends Hilt_WelcomeFragment<FragmentWelcomeBinding> {
    public static final int $stable = 8;
    private final f alertIcon$delegate;
    private FragmentWelcomeBinding binding;
    private final f checkmarkIcon$delegate;
    private l<? super Boolean, w> onNameValid;
    public UserRepository userRepository;
    private final x<String> displayNameVerificationEvents = n0.a(null);
    private final x<String> usernameVerificationEvents = n0.a(null);

    public WelcomeFragment() {
        f b10;
        f b11;
        b10 = h.b(new WelcomeFragment$checkmarkIcon$2(this));
        this.checkmarkIcon$delegate = b10;
        b11 = h.b(new WelcomeFragment$alertIcon$2(this));
        this.alertIcon$delegate = b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getAlertIcon() {
        return (Drawable) this.alertIcon$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable getCheckmarkIcon() {
        return (Drawable) this.checkmarkIcon$delegate.getValue();
    }

    public final String getDisplayName() {
        EditText editText;
        Editable text;
        String obj;
        FragmentWelcomeBinding binding = getBinding();
        if (binding == null || (editText = binding.displayNameEditText) == null || (text = editText.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final l<Boolean, w> getOnNameValid() {
        return this.onNameValid;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    public final String getUsername() {
        EditText editText;
        Editable text;
        String obj;
        FragmentWelcomeBinding binding = getBinding();
        if (binding == null || (editText = binding.usernameEditText) == null || (text = editText.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        EditText editText;
        EditText editText2;
        SpeechBubbleView speechBubbleView;
        String str;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentWelcomeBinding binding = getBinding();
        if (binding != null && (speechBubbleView = binding.speechBubble) != null) {
            Context context = getContext();
            if (context == null || (str = context.getString(R.string.welcome_text)) == null) {
                str = "";
            }
            speechBubbleView.animateText(str);
        }
        super.onCreate(bundle);
        FragmentWelcomeBinding binding2 = getBinding();
        if (binding2 != null && (editText2 = binding2.displayNameEditText) != null) {
            editText2.addTextChangedListener(new OnChangeTextWatcher(new WelcomeFragment$onViewCreated$1(this)));
        }
        FragmentWelcomeBinding binding3 = getBinding();
        if (binding3 != null && (editText = binding3.usernameEditText) != null) {
            editText.addTextChangedListener(new OnChangeTextWatcher(new WelcomeFragment$onViewCreated$2(this)));
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new WelcomeFragment$onViewCreated$3(this, null), 1, null);
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new WelcomeFragment$onViewCreated$4(this, null), 1, null);
        i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new WelcomeFragment$onViewCreated$5(this, null), 2, null);
    }

    public final void setOnNameValid(l<? super Boolean, w> lVar) {
        this.onNameValid = lVar;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentWelcomeBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentWelcomeBinding inflate = FragmentWelcomeBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentWelcomeBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentWelcomeBinding fragmentWelcomeBinding) {
        this.binding = fragmentWelcomeBinding;
    }
}
