package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.SupportCollapsibleSection;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentFaqOverviewBinding implements a {
    public final SupportCollapsibleSection contribTierSection;
    public final SupportCollapsibleSection experienceSection;
    public final LinearLayout faqLinearLayout;
    public final SupportCollapsibleSection gemsSection;
    public final SupportCollapsibleSection goldSection;
    public final SupportCollapsibleSection healthSection;
    public final SupportCollapsibleSection hourglassesSection;
    public final SupportCollapsibleSection manaSection;
    public final TextView moreHelpTextView;
    public final ShopHeaderBinding npcHeader;
    private final ScrollView rootView;
    public final SupportCollapsibleSection statsSection;

    private FragmentFaqOverviewBinding(ScrollView scrollView, SupportCollapsibleSection supportCollapsibleSection, SupportCollapsibleSection supportCollapsibleSection2, LinearLayout linearLayout, SupportCollapsibleSection supportCollapsibleSection3, SupportCollapsibleSection supportCollapsibleSection4, SupportCollapsibleSection supportCollapsibleSection5, SupportCollapsibleSection supportCollapsibleSection6, SupportCollapsibleSection supportCollapsibleSection7, TextView textView, ShopHeaderBinding shopHeaderBinding, SupportCollapsibleSection supportCollapsibleSection8) {
        this.rootView = scrollView;
        this.contribTierSection = supportCollapsibleSection;
        this.experienceSection = supportCollapsibleSection2;
        this.faqLinearLayout = linearLayout;
        this.gemsSection = supportCollapsibleSection3;
        this.goldSection = supportCollapsibleSection4;
        this.healthSection = supportCollapsibleSection5;
        this.hourglassesSection = supportCollapsibleSection6;
        this.manaSection = supportCollapsibleSection7;
        this.moreHelpTextView = textView;
        this.npcHeader = shopHeaderBinding;
        this.statsSection = supportCollapsibleSection8;
    }

    public static FragmentFaqOverviewBinding bind(View view) {
        int i10 = R.id.contrib_tier_section;
        SupportCollapsibleSection supportCollapsibleSection = (SupportCollapsibleSection) b.a(view, R.id.contrib_tier_section);
        if (supportCollapsibleSection != null) {
            i10 = R.id.experience_section;
            SupportCollapsibleSection supportCollapsibleSection2 = (SupportCollapsibleSection) b.a(view, R.id.experience_section);
            if (supportCollapsibleSection2 != null) {
                i10 = R.id.faq_linear_layout;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.faq_linear_layout);
                if (linearLayout != null) {
                    i10 = R.id.gems_section;
                    SupportCollapsibleSection supportCollapsibleSection3 = (SupportCollapsibleSection) b.a(view, R.id.gems_section);
                    if (supportCollapsibleSection3 != null) {
                        i10 = R.id.gold_section;
                        SupportCollapsibleSection supportCollapsibleSection4 = (SupportCollapsibleSection) b.a(view, R.id.gold_section);
                        if (supportCollapsibleSection4 != null) {
                            i10 = R.id.health_section;
                            SupportCollapsibleSection supportCollapsibleSection5 = (SupportCollapsibleSection) b.a(view, R.id.health_section);
                            if (supportCollapsibleSection5 != null) {
                                i10 = R.id.hourglasses_section;
                                SupportCollapsibleSection supportCollapsibleSection6 = (SupportCollapsibleSection) b.a(view, R.id.hourglasses_section);
                                if (supportCollapsibleSection6 != null) {
                                    i10 = R.id.mana_section;
                                    SupportCollapsibleSection supportCollapsibleSection7 = (SupportCollapsibleSection) b.a(view, R.id.mana_section);
                                    if (supportCollapsibleSection7 != null) {
                                        i10 = R.id.more_help_text_view;
                                        TextView textView = (TextView) b.a(view, R.id.more_help_text_view);
                                        if (textView != null) {
                                            i10 = R.id.npc_header;
                                            View a10 = b.a(view, R.id.npc_header);
                                            if (a10 != null) {
                                                ShopHeaderBinding bind = ShopHeaderBinding.bind(a10);
                                                i10 = R.id.stats_section;
                                                SupportCollapsibleSection supportCollapsibleSection8 = (SupportCollapsibleSection) b.a(view, R.id.stats_section);
                                                if (supportCollapsibleSection8 != null) {
                                                    return new FragmentFaqOverviewBinding((ScrollView) view, supportCollapsibleSection, supportCollapsibleSection2, linearLayout, supportCollapsibleSection3, supportCollapsibleSection4, supportCollapsibleSection5, supportCollapsibleSection6, supportCollapsibleSection7, textView, bind, supportCollapsibleSection8);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFaqOverviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentFaqOverviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_faq_overview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}
