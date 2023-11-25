package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.stats.StatsView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class FragmentStatsBinding implements a {
    public final LinearLayout autoAllocationModeWrapper;
    public final SwitchMaterial automaticAllocationSwitch;
    public final StatsView constitutionStatsView;
    public final RadioButton distributeClassButton;
    public final ImageButton distributeClassHelpButton;
    public final RadioButton distributeEvenlyButton;
    public final ImageButton distributeEvenlyHelpButton;
    public final RadioButton distributeTaskButton;
    public final ImageButton distributeTaskHelpButton;
    public final StatsView intelligenceStatsView;
    public final ImageView leftSparklesView;
    public final TextView numberOfPointsTextView;
    public final StatsView perceptionStatsView;
    public final ImageView rightSparklesView;
    private final NestedScrollView rootView;
    public final LinearLayout statsAllocationButton;
    public final StatsView strengthStatsView;
    public final TextView unlockAtLevel;

    private FragmentStatsBinding(NestedScrollView nestedScrollView, LinearLayout linearLayout, SwitchMaterial switchMaterial, StatsView statsView, RadioButton radioButton, ImageButton imageButton, RadioButton radioButton2, ImageButton imageButton2, RadioButton radioButton3, ImageButton imageButton3, StatsView statsView2, ImageView imageView, TextView textView, StatsView statsView3, ImageView imageView2, LinearLayout linearLayout2, StatsView statsView4, TextView textView2) {
        this.rootView = nestedScrollView;
        this.autoAllocationModeWrapper = linearLayout;
        this.automaticAllocationSwitch = switchMaterial;
        this.constitutionStatsView = statsView;
        this.distributeClassButton = radioButton;
        this.distributeClassHelpButton = imageButton;
        this.distributeEvenlyButton = radioButton2;
        this.distributeEvenlyHelpButton = imageButton2;
        this.distributeTaskButton = radioButton3;
        this.distributeTaskHelpButton = imageButton3;
        this.intelligenceStatsView = statsView2;
        this.leftSparklesView = imageView;
        this.numberOfPointsTextView = textView;
        this.perceptionStatsView = statsView3;
        this.rightSparklesView = imageView2;
        this.statsAllocationButton = linearLayout2;
        this.strengthStatsView = statsView4;
        this.unlockAtLevel = textView2;
    }

    public static FragmentStatsBinding bind(View view) {
        int i10 = R.id.autoAllocationModeWrapper;
        LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.autoAllocationModeWrapper);
        if (linearLayout != null) {
            i10 = R.id.automaticAllocationSwitch;
            SwitchMaterial switchMaterial = (SwitchMaterial) b.a(view, R.id.automaticAllocationSwitch);
            if (switchMaterial != null) {
                i10 = R.id.constitutionStatsView;
                StatsView statsView = (StatsView) b.a(view, R.id.constitutionStatsView);
                if (statsView != null) {
                    i10 = R.id.distributeClassButton;
                    RadioButton radioButton = (RadioButton) b.a(view, R.id.distributeClassButton);
                    if (radioButton != null) {
                        i10 = R.id.distributeClassHelpButton;
                        ImageButton imageButton = (ImageButton) b.a(view, R.id.distributeClassHelpButton);
                        if (imageButton != null) {
                            i10 = R.id.distributeEvenlyButton;
                            RadioButton radioButton2 = (RadioButton) b.a(view, R.id.distributeEvenlyButton);
                            if (radioButton2 != null) {
                                i10 = R.id.distributeEvenlyHelpButton;
                                ImageButton imageButton2 = (ImageButton) b.a(view, R.id.distributeEvenlyHelpButton);
                                if (imageButton2 != null) {
                                    i10 = R.id.distributeTaskButton;
                                    RadioButton radioButton3 = (RadioButton) b.a(view, R.id.distributeTaskButton);
                                    if (radioButton3 != null) {
                                        i10 = R.id.distributeTaskHelpButton;
                                        ImageButton imageButton3 = (ImageButton) b.a(view, R.id.distributeTaskHelpButton);
                                        if (imageButton3 != null) {
                                            i10 = R.id.intelligenceStatsView;
                                            StatsView statsView2 = (StatsView) b.a(view, R.id.intelligenceStatsView);
                                            if (statsView2 != null) {
                                                i10 = R.id.leftSparklesView;
                                                ImageView imageView = (ImageView) b.a(view, R.id.leftSparklesView);
                                                if (imageView != null) {
                                                    i10 = R.id.numberOfPointsTextView;
                                                    TextView textView = (TextView) b.a(view, R.id.numberOfPointsTextView);
                                                    if (textView != null) {
                                                        i10 = R.id.perceptionStatsView;
                                                        StatsView statsView3 = (StatsView) b.a(view, R.id.perceptionStatsView);
                                                        if (statsView3 != null) {
                                                            i10 = R.id.rightSparklesView;
                                                            ImageView imageView2 = (ImageView) b.a(view, R.id.rightSparklesView);
                                                            if (imageView2 != null) {
                                                                i10 = R.id.statsAllocationButton;
                                                                LinearLayout linearLayout2 = (LinearLayout) b.a(view, R.id.statsAllocationButton);
                                                                if (linearLayout2 != null) {
                                                                    i10 = R.id.strengthStatsView;
                                                                    StatsView statsView4 = (StatsView) b.a(view, R.id.strengthStatsView);
                                                                    if (statsView4 != null) {
                                                                        i10 = R.id.unlock_at_level;
                                                                        TextView textView2 = (TextView) b.a(view, R.id.unlock_at_level);
                                                                        if (textView2 != null) {
                                                                            return new FragmentStatsBinding((NestedScrollView) view, linearLayout, switchMaterial, statsView, radioButton, imageButton, radioButton2, imageButton2, radioButton3, imageButton3, statsView2, imageView, textView, statsView3, imageView2, linearLayout2, statsView4, textView2);
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

    public static FragmentStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stats, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // e4.a
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
