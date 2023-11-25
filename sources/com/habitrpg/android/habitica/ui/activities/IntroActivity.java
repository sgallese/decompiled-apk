package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.databinding.ActivityIntroBinding;
import com.habitrpg.android.habitica.ui.fragments.setup.IntroFragment;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.viewpagerindicator.IconPageIndicator;

/* compiled from: IntroActivity.kt */
/* loaded from: classes4.dex */
public final class IntroActivity extends Hilt_IntroActivity implements View.OnClickListener, ViewPager.j {
    public static final int $stable = 8;
    private ActivityIntroBinding binding;
    public ContentRepository contentRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: IntroActivity.kt */
    /* loaded from: classes4.dex */
    public final class PagerAdapter extends androidx.fragment.app.i0 implements pa.a {
        final /* synthetic */ IntroActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PagerAdapter(IntroActivity introActivity, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            qc.q.i(fragmentManager, "fm");
            this.this$0 = introActivity;
        }

        @Override // androidx.viewpager.widget.a, pa.a
        public int getCount() {
            return 3;
        }

        @Override // pa.a
        public int getIconResId(int i10) {
            return R.drawable.indicator_diamond;
        }

        @Override // androidx.fragment.app.i0
        public Fragment getItem(int i10) {
            IntroFragment introFragment = new IntroFragment();
            this.this$0.configureFragment(introFragment, i10);
            return introFragment;
        }

        @Override // androidx.fragment.app.i0, androidx.viewpager.widget.a
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            qc.q.i(viewGroup, "container");
            Object instantiateItem = super.instantiateItem(viewGroup, i10);
            qc.q.h(instantiateItem, "instantiateItem(...)");
            if (instantiateItem instanceof IntroFragment) {
                this.this$0.configureFragment((IntroFragment) instantiateItem, i10);
            }
            return instantiateItem;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureFragment(IntroFragment introFragment, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    introFragment.setImage(androidx.core.content.res.h.e(getResources(), R.drawable.intro_3, null));
                    introFragment.setSubtitle(getString(R.string.intro_3_subtitle));
                    introFragment.setTitle(getString(R.string.intro_3_title));
                    introFragment.setDescription(getString(R.string.intro_3_description));
                    introFragment.setBackgroundColor(androidx.core.content.a.c(this, R.color.red_100));
                    return;
                }
                return;
            }
            introFragment.setImage(androidx.core.content.res.h.e(getResources(), R.drawable.intro_2, null));
            introFragment.setSubtitle(getString(R.string.intro_2_subtitle));
            introFragment.setTitle(getString(R.string.intro_2_title));
            introFragment.setDescription(getString(R.string.intro_2_description));
            introFragment.setBackgroundColor(androidx.core.content.a.c(this, R.color.blue_10));
            return;
        }
        introFragment.setImage(androidx.core.content.res.h.e(getResources(), R.drawable.intro_1, null));
        introFragment.setSubtitle(getString(R.string.intro_1_subtitle));
        introFragment.setTitleImage(androidx.core.content.res.h.e(getResources(), R.drawable.intro_1_title, null));
        introFragment.setDescription(getString(R.string.intro_1_description, getString(R.string.habitica_user_count)));
        introFragment.setBackgroundColor(androidx.core.content.a.c(this, R.color.brand_300));
    }

    private final void finishIntro() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(335577088);
        startActivity(intent);
        overridePendingTransition(0, R.anim.activity_fade_out);
        finish();
    }

    private final void setupIntro() {
        ActivityIntroBinding activityIntroBinding = this.binding;
        ActivityIntroBinding activityIntroBinding2 = null;
        if (activityIntroBinding == null) {
            qc.q.z("binding");
            activityIntroBinding = null;
        }
        ViewPager viewPager = activityIntroBinding.viewPager;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        qc.q.h(supportFragmentManager, "getSupportFragmentManager(...)");
        viewPager.setAdapter(new PagerAdapter(this, supportFragmentManager));
        ActivityIntroBinding activityIntroBinding3 = this.binding;
        if (activityIntroBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityIntroBinding2 = activityIntroBinding3;
        }
        activityIntroBinding2.viewPager.addOnPageChangeListener(this);
    }

    public final ContentRepository getContentRepository() {
        ContentRepository contentRepository = this.contentRepository;
        if (contentRepository != null) {
            return contentRepository;
        }
        qc.q.z("contentRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityIntroBinding inflate = ActivityIntroBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        FrameLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_intro);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        qc.q.i(view, "v");
        finishIntro();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupIntro();
        ActivityIntroBinding activityIntroBinding = this.binding;
        if (activityIntroBinding == null) {
            qc.q.z("binding");
            activityIntroBinding = null;
        }
        IconPageIndicator iconPageIndicator = activityIntroBinding.viewPagerIndicator;
        ActivityIntroBinding activityIntroBinding2 = this.binding;
        if (activityIntroBinding2 == null) {
            qc.q.z("binding");
            activityIntroBinding2 = null;
        }
        iconPageIndicator.setViewPager(activityIntroBinding2.viewPager);
        ActivityIntroBinding activityIntroBinding3 = this.binding;
        if (activityIntroBinding3 == null) {
            qc.q.z("binding");
            activityIntroBinding3 = null;
        }
        activityIntroBinding3.skipButton.setOnClickListener(this);
        ActivityIntroBinding activityIntroBinding4 = this.binding;
        if (activityIntroBinding4 == null) {
            qc.q.z("binding");
            activityIntroBinding4 = null;
        }
        activityIntroBinding4.finishButton.setOnClickListener(this);
        ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new IntroActivity$onCreate$1(this, null), 2, null);
        getWindow().setStatusBarColor(androidx.core.content.a.c(this, R.color.black_20_alpha));
        getWindow().addFlags(67108864);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i10) {
        ActivityIntroBinding activityIntroBinding = null;
        if (i10 == 2) {
            ActivityIntroBinding activityIntroBinding2 = this.binding;
            if (activityIntroBinding2 == null) {
                qc.q.z("binding");
            } else {
                activityIntroBinding = activityIntroBinding2;
            }
            activityIntroBinding.finishButton.setVisibility(0);
            return;
        }
        ActivityIntroBinding activityIntroBinding3 = this.binding;
        if (activityIntroBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityIntroBinding = activityIntroBinding3;
        }
        activityIntroBinding.finishButton.setVisibility(8);
    }

    public final void setContentRepository(ContentRepository contentRepository) {
        qc.q.i(contentRepository, "<set-?>");
        this.contentRepository = contentRepository;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i10, float f10, int i11) {
    }
}
