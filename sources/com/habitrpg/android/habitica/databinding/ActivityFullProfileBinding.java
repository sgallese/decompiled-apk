package com.habitrpg.android.habitica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.common.habitica.views.PixelArtView;
import e4.a;
import e4.b;

/* loaded from: classes4.dex */
public final class ActivityFullProfileBinding implements a {
    public final RecyclerViewEmptySupport achievementGroupList;
    public final TextView adminStatusTextview;
    public final LinearLayout adminStatusView;
    public final FrameLayout attributesCardView;
    public final AppCompatImageView attributesCollapseIcon;
    public final TableLayout attributesTableLayout;
    public final ComposeView avatarWithBars;
    public final FrameLayout blockedDisclaimerView;
    public final TextView blurbTextView;
    public final FrameLayout costumeCard;
    public final TableLayout costumeTableLayout;
    public final PixelArtView currentMountDrawee;
    public final PixelArtView currentPetDrawee;
    public final TableLayout equipmentTableLayout;
    public final Button giftGemsButton;
    public final Button giftSubscriptionButton;
    public final TextView joinedView;
    public final TextView lastLoginView;
    public final TextView mountsTamedCount;
    public final TextView petsFoundCount;
    public final FrameLayout profileAchievementsCard;
    public final ImageView profileImage;
    private final LinearLayout rootView;
    public final NestedScrollView scrollView;
    public final Button sendMessageButton;
    public final Toolbar toolbar;
    public final TextView totalCheckinsView;

    private ActivityFullProfileBinding(LinearLayout linearLayout, RecyclerViewEmptySupport recyclerViewEmptySupport, TextView textView, LinearLayout linearLayout2, FrameLayout frameLayout, AppCompatImageView appCompatImageView, TableLayout tableLayout, ComposeView composeView, FrameLayout frameLayout2, TextView textView2, FrameLayout frameLayout3, TableLayout tableLayout2, PixelArtView pixelArtView, PixelArtView pixelArtView2, TableLayout tableLayout3, Button button, Button button2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, FrameLayout frameLayout4, ImageView imageView, NestedScrollView nestedScrollView, Button button3, Toolbar toolbar, TextView textView7) {
        this.rootView = linearLayout;
        this.achievementGroupList = recyclerViewEmptySupport;
        this.adminStatusTextview = textView;
        this.adminStatusView = linearLayout2;
        this.attributesCardView = frameLayout;
        this.attributesCollapseIcon = appCompatImageView;
        this.attributesTableLayout = tableLayout;
        this.avatarWithBars = composeView;
        this.blockedDisclaimerView = frameLayout2;
        this.blurbTextView = textView2;
        this.costumeCard = frameLayout3;
        this.costumeTableLayout = tableLayout2;
        this.currentMountDrawee = pixelArtView;
        this.currentPetDrawee = pixelArtView2;
        this.equipmentTableLayout = tableLayout3;
        this.giftGemsButton = button;
        this.giftSubscriptionButton = button2;
        this.joinedView = textView3;
        this.lastLoginView = textView4;
        this.mountsTamedCount = textView5;
        this.petsFoundCount = textView6;
        this.profileAchievementsCard = frameLayout4;
        this.profileImage = imageView;
        this.scrollView = nestedScrollView;
        this.sendMessageButton = button3;
        this.toolbar = toolbar;
        this.totalCheckinsView = textView7;
    }

    public static ActivityFullProfileBinding bind(View view) {
        int i10 = R.id.achievement_group_list;
        RecyclerViewEmptySupport recyclerViewEmptySupport = (RecyclerViewEmptySupport) b.a(view, R.id.achievement_group_list);
        if (recyclerViewEmptySupport != null) {
            i10 = R.id.admin_status_textview;
            TextView textView = (TextView) b.a(view, R.id.admin_status_textview);
            if (textView != null) {
                i10 = R.id.admin_status_view;
                LinearLayout linearLayout = (LinearLayout) b.a(view, R.id.admin_status_view);
                if (linearLayout != null) {
                    i10 = R.id.attributes_card_view;
                    FrameLayout frameLayout = (FrameLayout) b.a(view, R.id.attributes_card_view);
                    if (frameLayout != null) {
                        i10 = R.id.attributes_collapse_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) b.a(view, R.id.attributes_collapse_icon);
                        if (appCompatImageView != null) {
                            i10 = R.id.attributes_table_layout;
                            TableLayout tableLayout = (TableLayout) b.a(view, R.id.attributes_table_layout);
                            if (tableLayout != null) {
                                i10 = R.id.avatar_with_bars;
                                ComposeView composeView = (ComposeView) b.a(view, R.id.avatar_with_bars);
                                if (composeView != null) {
                                    i10 = R.id.blocked_disclaimer_view;
                                    FrameLayout frameLayout2 = (FrameLayout) b.a(view, R.id.blocked_disclaimer_view);
                                    if (frameLayout2 != null) {
                                        i10 = R.id.blurb_text_view;
                                        TextView textView2 = (TextView) b.a(view, R.id.blurb_text_view);
                                        if (textView2 != null) {
                                            i10 = R.id.costume_card;
                                            FrameLayout frameLayout3 = (FrameLayout) b.a(view, R.id.costume_card);
                                            if (frameLayout3 != null) {
                                                i10 = R.id.costume_table_layout;
                                                TableLayout tableLayout2 = (TableLayout) b.a(view, R.id.costume_table_layout);
                                                if (tableLayout2 != null) {
                                                    i10 = R.id.current_mount_drawee;
                                                    PixelArtView pixelArtView = (PixelArtView) b.a(view, R.id.current_mount_drawee);
                                                    if (pixelArtView != null) {
                                                        i10 = R.id.current_pet_drawee;
                                                        PixelArtView pixelArtView2 = (PixelArtView) b.a(view, R.id.current_pet_drawee);
                                                        if (pixelArtView2 != null) {
                                                            i10 = R.id.equipment_table_layout;
                                                            TableLayout tableLayout3 = (TableLayout) b.a(view, R.id.equipment_table_layout);
                                                            if (tableLayout3 != null) {
                                                                i10 = R.id.gift_gems_button;
                                                                Button button = (Button) b.a(view, R.id.gift_gems_button);
                                                                if (button != null) {
                                                                    i10 = R.id.gift_subscription_button;
                                                                    Button button2 = (Button) b.a(view, R.id.gift_subscription_button);
                                                                    if (button2 != null) {
                                                                        i10 = R.id.joined_view;
                                                                        TextView textView3 = (TextView) b.a(view, R.id.joined_view);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.last_login_view;
                                                                            TextView textView4 = (TextView) b.a(view, R.id.last_login_view);
                                                                            if (textView4 != null) {
                                                                                i10 = R.id.mounts_tamed_count;
                                                                                TextView textView5 = (TextView) b.a(view, R.id.mounts_tamed_count);
                                                                                if (textView5 != null) {
                                                                                    i10 = R.id.pets_found_count;
                                                                                    TextView textView6 = (TextView) b.a(view, R.id.pets_found_count);
                                                                                    if (textView6 != null) {
                                                                                        i10 = R.id.profile_achievements_card;
                                                                                        FrameLayout frameLayout4 = (FrameLayout) b.a(view, R.id.profile_achievements_card);
                                                                                        if (frameLayout4 != null) {
                                                                                            i10 = R.id.profile_image;
                                                                                            ImageView imageView = (ImageView) b.a(view, R.id.profile_image);
                                                                                            if (imageView != null) {
                                                                                                i10 = R.id.scroll_view;
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) b.a(view, R.id.scroll_view);
                                                                                                if (nestedScrollView != null) {
                                                                                                    i10 = R.id.send_message_button;
                                                                                                    Button button3 = (Button) b.a(view, R.id.send_message_button);
                                                                                                    if (button3 != null) {
                                                                                                        i10 = R.id.toolbar;
                                                                                                        Toolbar toolbar = (Toolbar) b.a(view, R.id.toolbar);
                                                                                                        if (toolbar != null) {
                                                                                                            i10 = R.id.total_checkins_view;
                                                                                                            TextView textView7 = (TextView) b.a(view, R.id.total_checkins_view);
                                                                                                            if (textView7 != null) {
                                                                                                                return new ActivityFullProfileBinding((LinearLayout) view, recyclerViewEmptySupport, textView, linearLayout, frameLayout, appCompatImageView, tableLayout, composeView, frameLayout2, textView2, frameLayout3, tableLayout2, pixelArtView, pixelArtView2, tableLayout3, button, button2, textView3, textView4, textView5, textView6, frameLayout4, imageView, nestedScrollView, button3, toolbar, textView7);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityFullProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFullProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_full_profile, viewGroup, false);
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
