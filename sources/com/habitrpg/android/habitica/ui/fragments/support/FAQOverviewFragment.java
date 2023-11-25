package com.habitrpg.android.habitica.ui.fragments.support;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.databinding.FragmentFaqOverviewBinding;
import com.habitrpg.android.habitica.databinding.ShopHeaderBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.NPCBannerView;
import com.habitrpg.android.habitica.ui.views.SupportCollapsibleSection;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.AppTestingLevel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.models.PlayerTier;
import ec.b0;
import java.util.Iterator;
import java.util.List;
import la.b;
import qc.q;

/* compiled from: FAQOverviewFragment.kt */
/* loaded from: classes4.dex */
public final class FAQOverviewFragment extends Hilt_FAQOverviewFragment<FragmentFaqOverviewBinding> {
    public static final int $stable = 8;
    public AppConfigManager appConfigManager;
    private FragmentFaqOverviewBinding binding;
    public AppConfigManager configManager;
    private b.c deviceInfo;
    public FAQRepository faqRepository;
    public MainUserViewModel userViewModel;
    private final dc.f versionCode$delegate;
    private final dc.f versionName$delegate;

    public FAQOverviewFragment() {
        dc.f b10;
        dc.f b11;
        b10 = dc.h.b(new FAQOverviewFragment$versionName$2(this));
        this.versionName$delegate = b10;
        b11 = dc.h.b(new FAQOverviewFragment$versionCode$2(this));
        this.versionCode$delegate = b11;
    }

    private final void addPlayerTiers() {
        ViewGroup viewGroup;
        ViewParent viewParent;
        SupportCollapsibleSection supportCollapsibleSection;
        Object m02;
        int dpToPx;
        int i10;
        Resources resources;
        SupportCollapsibleSection supportCollapsibleSection2;
        List<PlayerTier> tiers = PlayerTier.Companion.getTiers();
        Iterator<PlayerTier> it = tiers.iterator();
        while (true) {
            viewGroup = null;
            if (!it.hasNext()) {
                break;
            }
            PlayerTier next = it.next();
            Context context = getContext();
            if (context != null) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackground(androidx.core.content.a.e(context, R.drawable.rounded_border));
                frameLayout.getBackground().setTint(PlayerTier.Companion.getColorForTier(context, next.getId()));
                frameLayout.getBackground().setAlpha(50);
                UsernameLabel usernameLabel = new UsernameLabel(context, null);
                usernameLabel.setTier(next.getId());
                usernameLabel.setUsername(next.getTitle());
                frameLayout.addView(usernameLabel, new FrameLayout.LayoutParams(-2, -2, 17));
                frameLayout.setVisibility(8);
                FragmentFaqOverviewBinding binding = getBinding();
                if (binding != null && (supportCollapsibleSection2 = binding.contribTierSection) != null) {
                    supportCollapsibleSection2.addView(frameLayout);
                }
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                q.g(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int dpToPx2 = IntExtensionsKt.dpToPx(12, getContext());
                int dpToPx3 = IntExtensionsKt.dpToPx(12, getContext());
                m02 = b0.m0(tiers);
                if (q.d(m02, next)) {
                    dpToPx = IntExtensionsKt.dpToPx(12, getContext());
                } else {
                    dpToPx = IntExtensionsKt.dpToPx(6, getContext());
                }
                layoutParams2.setMargins(dpToPx2, 0, dpToPx3, dpToPx);
                Context context2 = getContext();
                if (context2 != null && (resources = context2.getResources()) != null) {
                    i10 = (int) resources.getDimension(R.dimen.spacing_medium);
                } else {
                    i10 = 0;
                }
                frameLayout.setPadding(0, i10, 0, i10);
            }
        }
        FragmentFaqOverviewBinding binding2 = getBinding();
        if (binding2 != null && (supportCollapsibleSection = binding2.contribTierSection) != null) {
            viewParent = supportCollapsibleSection.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = viewParent;
        }
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final int getVersionCode() {
        return ((Number) this.versionCode$delegate.getValue()).intValue();
    }

    private final String getVersionName() {
        return (String) this.versionName$delegate.getValue();
    }

    private final void loadArticles() {
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new FAQOverviewFragment$loadArticles$1(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEmail(String str) {
        String e10;
        String str2;
        int i10;
        String str3;
        boolean z10;
        boolean z11;
        int i11;
        Integer lvl;
        int i12 = Build.VERSION.SDK_INT;
        b.c cVar = this.deviceInfo;
        if (cVar == null || (e10 = cVar.a()) == null) {
            e10 = la.b.e();
        }
        b.c cVar2 = this.deviceInfo;
        if (cVar2 == null || (str2 = cVar2.f19633a) == null) {
            str2 = Build.MANUFACTURER;
        }
        int i13 = 0;
        boolean z12 = true;
        String str4 = Uri.encode("Device: " + str2 + " " + e10) + "%0D%0A" + Uri.encode("Android Version: " + i12) + "%0D%0A" + Uri.encode("AppVersion: " + getString(R.string.version_info, getVersionName(), Integer.valueOf(getVersionCode())));
        if (!q.d(getAppConfigManager().testingLevel().name(), AppTestingLevel.PRODUCTION.name())) {
            str4 = ((Object) str4) + " " + Uri.encode(getAppConfigManager().testingLevel().name());
        }
        String str5 = ((Object) str4) + "%0D%0A" + Uri.encode("User ID: " + getUserViewModel().getUserID());
        User f10 = getUserViewModel().getUser().f();
        if (f10 != null) {
            Stats stats = f10.getStats();
            if (stats != null && (lvl = stats.getLvl()) != null) {
                i10 = lvl.intValue();
            } else {
                i10 = 0;
            }
            String encode = Uri.encode("Level: " + i10);
            Preferences preferences = f10.getPreferences();
            if (preferences == null || !preferences.getDisableClasses()) {
                z12 = false;
            }
            if (z12) {
                str3 = "Disabled";
            } else {
                Stats stats2 = f10.getStats();
                if (stats2 == null || (str3 = stats2.getHabitClass()) == null) {
                    str3 = "None";
                }
            }
            String encode2 = Uri.encode("Class: " + str3);
            Preferences preferences2 = f10.getPreferences();
            if (preferences2 != null) {
                z10 = preferences2.getSleep();
            } else {
                z10 = false;
            }
            String encode3 = Uri.encode("Is in Inn: " + z10);
            Preferences preferences3 = f10.getPreferences();
            if (preferences3 != null) {
                z11 = preferences3.getCostume();
            } else {
                z11 = false;
            }
            String encode4 = Uri.encode("Uses Costume: " + z11);
            Preferences preferences4 = f10.getPreferences();
            if (preferences4 != null) {
                i11 = preferences4.getDayStart();
            } else {
                i11 = 0;
            }
            String encode5 = Uri.encode("Custom Day Start: " + i11);
            Preferences preferences5 = f10.getPreferences();
            if (preferences5 != null) {
                i13 = preferences5.getTimezoneOffset();
            }
            str5 = ((Object) str5) + "%0D%0A" + encode + "%0D%0A" + encode2 + "%0D%0A" + encode3 + "%0D%0A" + encode4 + "%0D%0A" + encode5 + "%0D%0A" + Uri.encode("Timezone Offset: " + i13);
        }
        String str6 = ((Object) str5) + "%0D%0ADetails:%0D%0A%0D%0A";
        if (getMainActivity() != null) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:" + getAppConfigManager().supportEmail() + "?subject=" + Uri.encode(str) + "&body=" + ((Object) str6)));
            startActivity(Intent.createChooser(intent, "Choose an Email client:"));
        }
    }

    public final AppConfigManager getAppConfigManager() {
        AppConfigManager appConfigManager = this.appConfigManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("appConfigManager");
        return null;
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        q.z("configManager");
        return null;
    }

    public final FAQRepository getFaqRepository() {
        FAQRepository fAQRepository = this.faqRepository;
        if (fAQRepository != null) {
            return fAQRepository;
        }
        q.z("faqRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        setShowsBackButton(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getFaqRepository().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        NPCBannerView nPCBannerView;
        NPCBannerView nPCBannerView2;
        TextView textView;
        int X;
        TextView textView2;
        SupportCollapsibleSection supportCollapsibleSection;
        ImageView imageView;
        SupportCollapsibleSection supportCollapsibleSection2;
        ImageView imageView2;
        SupportCollapsibleSection supportCollapsibleSection3;
        ImageView imageView3;
        SupportCollapsibleSection supportCollapsibleSection4;
        ImageView imageView4;
        SupportCollapsibleSection supportCollapsibleSection5;
        ImageView imageView5;
        SupportCollapsibleSection supportCollapsibleSection6;
        ImageView imageView6;
        SupportCollapsibleSection supportCollapsibleSection7;
        ImageView imageView7;
        SupportCollapsibleSection supportCollapsibleSection8;
        ImageView imageView8;
        ShopHeaderBinding shopHeaderBinding;
        ShopHeaderBinding shopHeaderBinding2;
        TextView textView3;
        ShopHeaderBinding shopHeaderBinding3;
        ShopHeaderBinding shopHeaderBinding4;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentFaqOverviewBinding binding = getBinding();
        TextView textView4 = null;
        if (binding != null && (shopHeaderBinding4 = binding.npcHeader) != null) {
            nPCBannerView = shopHeaderBinding4.npcBannerView;
        } else {
            nPCBannerView = null;
        }
        if (nPCBannerView != null) {
            nPCBannerView.setShopSpriteSuffix(getConfigManager().shopSpriteSuffix());
        }
        FragmentFaqOverviewBinding binding2 = getBinding();
        if (binding2 != null && (shopHeaderBinding3 = binding2.npcHeader) != null) {
            nPCBannerView2 = shopHeaderBinding3.npcBannerView;
        } else {
            nPCBannerView2 = null;
        }
        if (nPCBannerView2 != null) {
            nPCBannerView2.setIdentifier("tavern");
        }
        FragmentFaqOverviewBinding binding3 = getBinding();
        if (binding3 != null && (shopHeaderBinding2 = binding3.npcHeader) != null && (textView3 = shopHeaderBinding2.namePlate) != null) {
            textView3.setText(R.string.tavern_owner);
        }
        FragmentFaqOverviewBinding binding4 = getBinding();
        if (binding4 != null && (shopHeaderBinding = binding4.npcHeader) != null) {
            textView = shopHeaderBinding.descriptionView;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new FAQOverviewFragment$onViewCreated$1(this, null), 2, null);
        FragmentFaqOverviewBinding binding5 = getBinding();
        if (binding5 != null && (supportCollapsibleSection8 = binding5.healthSection) != null && (imageView8 = (ImageView) supportCollapsibleSection8.findViewById(R.id.icon_view)) != null) {
            imageView8.setImageBitmap(HabiticaIconsHelper.imageOfHeartLarge());
        }
        FragmentFaqOverviewBinding binding6 = getBinding();
        if (binding6 != null && (supportCollapsibleSection7 = binding6.experienceSection) != null && (imageView7 = (ImageView) supportCollapsibleSection7.findViewById(R.id.icon_view)) != null) {
            imageView7.setImageBitmap(HabiticaIconsHelper.imageOfExperienceReward());
        }
        FragmentFaqOverviewBinding binding7 = getBinding();
        if (binding7 != null && (supportCollapsibleSection6 = binding7.manaSection) != null && (imageView6 = (ImageView) supportCollapsibleSection6.findViewById(R.id.icon_view)) != null) {
            imageView6.setImageBitmap(HabiticaIconsHelper.imageOfMagicLarge());
        }
        FragmentFaqOverviewBinding binding8 = getBinding();
        if (binding8 != null && (supportCollapsibleSection5 = binding8.goldSection) != null && (imageView5 = (ImageView) supportCollapsibleSection5.findViewById(R.id.icon_view)) != null) {
            imageView5.setImageBitmap(HabiticaIconsHelper.imageOfGoldReward());
        }
        FragmentFaqOverviewBinding binding9 = getBinding();
        if (binding9 != null && (supportCollapsibleSection4 = binding9.gemsSection) != null && (imageView4 = (ImageView) supportCollapsibleSection4.findViewById(R.id.icon_view)) != null) {
            imageView4.setImageBitmap(HabiticaIconsHelper.imageOfGem());
        }
        FragmentFaqOverviewBinding binding10 = getBinding();
        if (binding10 != null && (supportCollapsibleSection3 = binding10.hourglassesSection) != null && (imageView3 = (ImageView) supportCollapsibleSection3.findViewById(R.id.icon_view)) != null) {
            imageView3.setImageBitmap(HabiticaIconsHelper.imageOfHourglassLarge());
        }
        FragmentFaqOverviewBinding binding11 = getBinding();
        if (binding11 != null && (supportCollapsibleSection2 = binding11.statsSection) != null && (imageView2 = (ImageView) supportCollapsibleSection2.findViewById(R.id.icon_view)) != null) {
            imageView2.setImageBitmap(HabiticaIconsHelper.imageOfStats());
        }
        FragmentFaqOverviewBinding binding12 = getBinding();
        if (binding12 != null && (supportCollapsibleSection = binding12.contribTierSection) != null && (imageView = (ImageView) supportCollapsibleSection.findViewById(R.id.icon_view)) != null) {
            imageView.setImageResource(R.drawable.contributor_icon);
        }
        addPlayerTiers();
        String string = getString(R.string.need_help_description);
        q.h(string, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment$onViewCreated$clickableSpan$1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view2) {
                q.i(view2, "textView");
                FAQOverviewFragment.this.sendEmail("[Android] Question");
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                q.i(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        };
        X = yc.w.X(string, "contact us", 0, false, 6, null);
        spannableStringBuilder.setSpan(clickableSpan, X, X + 10, 33);
        FragmentFaqOverviewBinding binding13 = getBinding();
        if (binding13 != null) {
            textView2 = binding13.moreHelpTextView;
        } else {
            textView2 = null;
        }
        if (textView2 != null) {
            textView2.setText(spannableStringBuilder);
        }
        FragmentFaqOverviewBinding binding14 = getBinding();
        if (binding14 != null) {
            textView4 = binding14.moreHelpTextView;
        }
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        loadArticles();
    }

    public final void setAppConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.appConfigManager = appConfigManager;
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setFaqRepository(FAQRepository fAQRepository) {
        q.i(fAQRepository, "<set-?>");
        this.faqRepository = fAQRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentFaqOverviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentFaqOverviewBinding inflate = FragmentFaqOverviewBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentFaqOverviewBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentFaqOverviewBinding fragmentFaqOverviewBinding) {
        this.binding = fragmentFaqOverviewBinding;
    }
}
