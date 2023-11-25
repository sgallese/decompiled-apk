package com.habitrpg.android.habitica.ui.fragments.support;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.databinding.FragmentFaqDetailBinding;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import qc.q;

/* compiled from: FAQDetailFragment.kt */
/* loaded from: classes4.dex */
public final class FAQDetailFragment extends Hilt_FAQDetailFragment<FragmentFaqDetailBinding> {
    public static final int $stable = 8;
    private FragmentFaqDetailBinding binding;
    public FAQRepository faqRepository;

    public final FAQRepository getFaqRepository() {
        FAQRepository fAQRepository = this.faqRepository;
        if (fAQRepository != null) {
            return fAQRepository;
        }
        q.z("faqRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        setShowsBackButton(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        TextView textView3 = null;
        if (arguments != null) {
            FAQDetailFragmentArgs fromBundle = FAQDetailFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            if (fromBundle.getQuestion() != null) {
                FragmentFaqDetailBinding binding = getBinding();
                if (binding != null) {
                    textView = binding.questionTextView;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setText(fromBundle.getQuestion());
                }
                FragmentFaqDetailBinding binding2 = getBinding();
                if (binding2 != null) {
                    textView2 = binding2.answerTextView;
                } else {
                    textView2 = null;
                }
                if (textView2 != null) {
                    textView2.setText(MarkdownParser.INSTANCE.parseMarkdown(fromBundle.getAnswer()));
                }
            } else {
                ExceptionHandlerKt.launchCatching$default(w.a(this), null, new FAQDetailFragment$onViewCreated$1$1(this, fromBundle, null), 1, null);
            }
        }
        FragmentFaqDetailBinding binding3 = getBinding();
        if (binding3 != null) {
            textView3 = binding3.answerTextView;
        }
        if (textView3 != null) {
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void setFaqRepository(FAQRepository fAQRepository) {
        q.i(fAQRepository, "<set-?>");
        this.faqRepository = fAQRepository;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentFaqDetailBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentFaqDetailBinding inflate = FragmentFaqDetailBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentFaqDetailBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentFaqDetailBinding fragmentFaqDetailBinding) {
        this.binding = fragmentFaqDetailBinding;
    }
}
