package com.habitrpg.android.habitica.ui.fragments.setup;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.databinding.FragmentIntroBinding;
import qc.q;

/* compiled from: IntroFragment.kt */
/* loaded from: classes4.dex */
public final class IntroFragment extends Hilt_IntroFragment<FragmentIntroBinding> {
    public static final int $stable = 8;
    private Integer backgroundColor;
    private FragmentIntroBinding binding;
    private String description;
    private Drawable image;
    private String subtitle;
    private String title;
    private Drawable titleImage;

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        FragmentIntroBinding binding;
        ImageView imageView;
        FragmentIntroBinding binding2;
        ImageView imageView2;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        if (this.image != null && (binding2 = getBinding()) != null && (imageView2 = binding2.imageView) != null) {
            imageView2.setImageDrawable(this.image);
        }
        if (this.titleImage != null && (binding = getBinding()) != null && (imageView = binding.titleImageView) != null) {
            imageView.setImageDrawable(this.titleImage);
        }
        TextView textView3 = null;
        if (this.subtitle != null) {
            FragmentIntroBinding binding3 = getBinding();
            if (binding3 != null) {
                textView2 = binding3.subtitleTextView;
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setText(this.subtitle);
            }
        }
        if (this.title != null) {
            FragmentIntroBinding binding4 = getBinding();
            if (binding4 != null) {
                textView = binding4.titleTextView;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setText(this.title);
            }
        }
        if (this.description != null) {
            FragmentIntroBinding binding5 = getBinding();
            if (binding5 != null) {
                textView3 = binding5.descriptionTextView;
            }
            if (textView3 != null) {
                textView3.setText(this.description);
            }
        }
        Integer num = this.backgroundColor;
        if (num != null) {
            int intValue = num.intValue();
            FragmentIntroBinding binding6 = getBinding();
            if (binding6 != null && (linearLayout = binding6.containerView) != null) {
                linearLayout.setBackgroundColor(intValue);
            }
        }
    }

    public final void setBackgroundColor(int i10) {
        LinearLayout linearLayout;
        this.backgroundColor = Integer.valueOf(i10);
        FragmentIntroBinding binding = getBinding();
        if (binding != null && (linearLayout = binding.containerView) != null) {
            linearLayout.setBackgroundColor(i10);
        }
    }

    public final void setDescription(String str) {
        TextView textView;
        this.description = str;
        FragmentIntroBinding binding = getBinding();
        if (binding != null) {
            textView = binding.descriptionTextView;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setImage(Drawable drawable) {
        FragmentIntroBinding binding;
        ImageView imageView;
        this.image = drawable;
        if (drawable != null && (binding = getBinding()) != null && (imageView = binding.imageView) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setSubtitle(String str) {
        TextView textView;
        this.subtitle = str;
        FragmentIntroBinding binding = getBinding();
        if (binding != null) {
            textView = binding.subtitleTextView;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setTitle(String str) {
        TextView textView;
        this.title = str;
        FragmentIntroBinding binding = getBinding();
        if (binding != null) {
            textView = binding.titleTextView;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setTitleImage(Drawable drawable) {
        ImageView imageView;
        this.titleImage = drawable;
        FragmentIntroBinding binding = getBinding();
        if (binding != null && (imageView = binding.titleImageView) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentIntroBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentIntroBinding inflate = FragmentIntroBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentIntroBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentIntroBinding fragmentIntroBinding) {
        this.binding = fragmentIntroBinding;
    }
}
