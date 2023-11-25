package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class WidgetAvatarStatsBinding implements a {
    public final TextView TVHpValue;
    public final ImageView avatarView;
    public final LinearLayout background;
    public final LinearLayout detailInfoView;
    public final ProgressBar expBar;
    public final TextView expTVValue;
    public final ImageView gemIcon;
    public final TextView gemsTv;
    public final ImageView goldIcon;
    public final TextView goldTv;
    public final ImageView hourglassIcon;
    public final TextView hourglassesTv;
    public final ProgressBar hpBar;
    public final ImageView icExpHeader;
    public final ImageView icHpHeader;
    public final ImageView icMpHeader;
    public final TextView lvlTv;
    public final ProgressBar mpBar;
    public final TextView mpTVValue;
    public final LinearLayout mpWrapper;
    private final LinearLayout rootView;

    private WidgetAvatarStatsBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3, TextView textView4, ImageView imageView4, TextView textView5, ProgressBar progressBar2, ImageView imageView5, ImageView imageView6, ImageView imageView7, TextView textView6, ProgressBar progressBar3, TextView textView7, LinearLayout linearLayout4) {
        this.rootView = linearLayout;
        this.TVHpValue = textView;
        this.avatarView = imageView;
        this.background = linearLayout2;
        this.detailInfoView = linearLayout3;
        this.expBar = progressBar;
        this.expTVValue = textView2;
        this.gemIcon = imageView2;
        this.gemsTv = textView3;
        this.goldIcon = imageView3;
        this.goldTv = textView4;
        this.hourglassIcon = imageView4;
        this.hourglassesTv = textView5;
        this.hpBar = progressBar2;
        this.icExpHeader = imageView5;
        this.icHpHeader = imageView6;
        this.icMpHeader = imageView7;
        this.lvlTv = textView6;
        this.mpBar = progressBar3;
        this.mpTVValue = textView7;
        this.mpWrapper = linearLayout4;
    }

    public static WidgetAvatarStatsBinding bind(View view) {
        int i10 = R.id.TV_hp_value;
        TextView textView = (TextView) b.a(view, R.id.TV_hp_value);
        if (textView != null) {
            i10 = R.id.avatar_view;
            ImageView imageView = (ImageView) b.a(view, R.id.avatar_view);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i10 = R.id.detail_info_view;
                LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.detail_info_view);
                if (linearLayout2 != null) {
                    i10 = R.id.exp_bar;
                    ProgressBar progressBar = (ProgressBar) b.a(view, R.id.exp_bar);
                    if (progressBar != null) {
                        i10 = R.id.exp_TV_value;
                        TextView textView2 = (TextView) b.a(view, R.id.exp_TV_value);
                        if (textView2 != null) {
                            i10 = R.id.gem_icon;
                            ImageView imageView2 = (ImageView) b.a(view, R.id.gem_icon);
                            if (imageView2 != null) {
                                i10 = R.id.gems_tv;
                                TextView textView3 = (TextView) b.a(view, R.id.gems_tv);
                                if (textView3 != null) {
                                    i10 = R.id.gold_icon;
                                    ImageView imageView3 = (ImageView) b.a(view, R.id.gold_icon);
                                    if (imageView3 != null) {
                                        i10 = R.id.gold_tv;
                                        TextView textView4 = (TextView) b.a(view, R.id.gold_tv);
                                        if (textView4 != null) {
                                            i10 = R.id.hourglass_icon;
                                            ImageView imageView4 = (ImageView) b.a(view, R.id.hourglass_icon);
                                            if (imageView4 != null) {
                                                i10 = R.id.hourglasses_tv;
                                                TextView textView5 = (TextView) b.a(view, R.id.hourglasses_tv);
                                                if (textView5 != null) {
                                                    i10 = R.id.hp_bar;
                                                    ProgressBar progressBar2 = (ProgressBar) b.a(view, R.id.hp_bar);
                                                    if (progressBar2 != null) {
                                                        i10 = R.id.ic_exp_header;
                                                        ImageView imageView5 = (ImageView) b.a(view, R.id.ic_exp_header);
                                                        if (imageView5 != null) {
                                                            i10 = R.id.ic_hp_header;
                                                            ImageView imageView6 = (ImageView) b.a(view, R.id.ic_hp_header);
                                                            if (imageView6 != null) {
                                                                i10 = R.id.ic_mp_header;
                                                                ImageView imageView7 = (ImageView) b.a(view, R.id.ic_mp_header);
                                                                if (imageView7 != null) {
                                                                    i10 = R.id.lvl_tv;
                                                                    TextView textView6 = (TextView) b.a(view, R.id.lvl_tv);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.mp_bar;
                                                                        ProgressBar progressBar3 = (ProgressBar) b.a(view, R.id.mp_bar);
                                                                        if (progressBar3 != null) {
                                                                            i10 = R.id.mp_TV_value;
                                                                            TextView textView7 = (TextView) b.a(view, R.id.mp_TV_value);
                                                                            if (textView7 != null) {
                                                                                i10 = R.id.mp_wrapper;
                                                                                LinearLayout linearLayout3 = (LinearLayout) b.a(view, R.id.mp_wrapper);
                                                                                if (linearLayout3 != null) {
                                                                                    return new WidgetAvatarStatsBinding(linearLayout, textView, imageView, linearLayout, linearLayout2, progressBar, textView2, imageView2, textView3, imageView3, textView4, imageView4, textView5, progressBar2, imageView5, imageView6, imageView7, textView6, progressBar3, textView7, linearLayout3);
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

    public static WidgetAvatarStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static WidgetAvatarStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_avatar_stats, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
