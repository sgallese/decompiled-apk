package com.habitrpg.android.habitica.ui.views.shops;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogPurchaseContentQuestBinding;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.QuestDropItem;
import com.habitrpg.android.habitica.models.inventory.QuestDrops;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import ec.t;
import ec.u;
import io.realm.x0;
import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: PurchaseDialogQuestContent.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialogQuestContent extends PurchaseDialogContent {
    public static final int $stable = 8;
    private final DialogPurchaseContentQuestBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialogQuestContent(Context context) {
        super(context, null, 0, 6, null);
        q.i(context, "context");
        DialogPurchaseContentQuestBinding inflate = DialogPurchaseContentQuestBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    private final void addRewardsRow(LayoutInflater layoutInflater, QuestDropItem questDropItem, ViewGroup viewGroup) {
        View view;
        ViewGroup viewGroup2;
        PixelArtView pixelArtView;
        TextView textView;
        if (layoutInflater != null) {
            view = layoutInflater.inflate(R.layout.row_quest_reward, viewGroup, false);
        } else {
            view = null;
        }
        if (view instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) view;
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 != null) {
            pixelArtView = (PixelArtView) viewGroup2.findViewById(R.id.imageView);
        } else {
            pixelArtView = null;
        }
        if (!(pixelArtView instanceof PixelArtView)) {
            pixelArtView = null;
        }
        if (viewGroup2 != null) {
            textView = (TextView) viewGroup2.findViewById(R.id.titleTextView);
        } else {
            textView = null;
        }
        if (!(textView instanceof TextView)) {
            textView = null;
        }
        if (pixelArtView != null) {
            DataBindingUtilsKt.loadImage$default(pixelArtView, questDropItem.getImageName(), null, 2, null);
        }
        if (questDropItem.getCount() > 1) {
            if (textView != null) {
                textView.setText(getContext().getString(R.string.quest_reward_count, questDropItem.getText(), Integer.valueOf(questDropItem.getCount())));
            }
        } else if (textView != null) {
            textView.setText(questDropItem.getText());
        }
        if (viewGroup != null) {
            viewGroup.addView(viewGroup2);
        }
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public PixelArtView getImageView() {
        PixelArtView pixelArtView = this.binding.imageView;
        q.h(pixelArtView, "imageView");
        return pixelArtView;
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public TextView getTitleTextView() {
        TextView textView = this.binding.titleTextView;
        q.h(textView, "titleTextView");
        return textView;
    }

    @Override // com.habitrpg.android.habitica.ui.views.shops.PurchaseDialogContent
    public void setQuestContentItem(QuestContent questContent) {
        List list;
        int s10;
        LayoutInflater layoutInflater;
        x0<QuestDropItem> x0Var;
        List<QuestDropItem> i10;
        int i11;
        int i12;
        View view;
        ViewGroup viewGroup;
        ImageView imageView;
        TextView textView;
        View view2;
        ViewGroup viewGroup2;
        ImageView imageView2;
        TextView textView2;
        Integer num;
        x0<QuestDropItem> items;
        Integer num2;
        boolean z10;
        q.i(questContent, "questContent");
        super.setQuestContentItem(questContent);
        this.binding.rageMeterView.setVisibility(8);
        float f10 = 1.0f;
        Integer num3 = null;
        if (questContent.isBossQuest()) {
            this.binding.questTypeTextView.setText(R.string.boss_quest);
            this.binding.questCollectView.setVisibility(8);
            TextView textView3 = this.binding.bossHealthText;
            QuestBoss boss = questContent.getBoss();
            if (boss != null) {
                num2 = Integer.valueOf(boss.getHp());
            } else {
                num2 = null;
            }
            textView3.setText(String.valueOf(num2));
            QuestBoss boss2 = questContent.getBoss();
            if (boss2 != null && boss2.getHasRage()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.binding.rageMeterView.setVisibility(0);
            }
            RatingBar ratingBar = this.binding.questDifficultyView;
            QuestBoss boss3 = questContent.getBoss();
            if (boss3 != null) {
                f10 = boss3.getStr();
            }
            ratingBar.setRating(f10);
        } else {
            this.binding.questTypeTextView.setText(R.string.collection_quest);
            x0<QuestCollect> collect = questContent.getCollect();
            if (collect != null) {
                s10 = u.s(collect, 10);
                list = new ArrayList(s10);
                for (QuestCollect questCollect : collect) {
                    list.add(questCollect.getCount() + " " + questCollect.getText());
                }
            } else {
                list = null;
            }
            TextView textView4 = this.binding.questCollectText;
            if (list == null) {
                list = t.i();
            }
            textView4.setText(TextUtils.join(", ", list));
            this.binding.bossHealthView.setVisibility(8);
            this.binding.questDifficultyView.setRating(1.0f);
        }
        this.binding.questDetailView.setVisibility(0);
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            layoutInflater = (LayoutInflater) systemService;
        } else {
            layoutInflater = null;
        }
        if (questContent.getDrop() != null) {
            QuestDrops drop = questContent.getDrop();
            if (drop != null) {
                x0Var = drop.getItems();
            } else {
                x0Var = null;
            }
            if (x0Var != null) {
                QuestDrops drop2 = questContent.getDrop();
                if (drop2 != null && (items = drop2.getItems()) != null) {
                    ArrayList<QuestDropItem> arrayList = new ArrayList();
                    for (QuestDropItem questDropItem : items) {
                        if (!questDropItem.getOnlyOwner()) {
                            arrayList.add(questDropItem);
                        }
                    }
                    for (QuestDropItem questDropItem2 : arrayList) {
                        q.f(questDropItem2);
                        addRewardsRow(layoutInflater, questDropItem2, this.binding.rewardsList);
                    }
                }
                QuestDrops drop3 = questContent.getDrop();
                if (drop3 == null || (i10 = drop3.getItems()) == null) {
                    i10 = t.i();
                }
                boolean z11 = false;
                for (QuestDropItem questDropItem3 : i10) {
                    if (questDropItem3.getOnlyOwner()) {
                        addRewardsRow(layoutInflater, questDropItem3, this.binding.ownerRewardsList);
                        z11 = true;
                    }
                }
                if (!z11) {
                    this.binding.ownerRewardsTitle.setVisibility(8);
                    this.binding.ownerRewardsList.setVisibility(8);
                }
                QuestDrops drop4 = questContent.getDrop();
                if (drop4 != null) {
                    i11 = drop4.getExp();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    if (layoutInflater != null) {
                        view2 = layoutInflater.inflate(R.layout.row_quest_reward_imageview, (ViewGroup) this.binding.rewardsList, false);
                    } else {
                        view2 = null;
                    }
                    if (view2 instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) view2;
                    } else {
                        viewGroup2 = null;
                    }
                    if (viewGroup2 != null) {
                        imageView2 = (ImageView) viewGroup2.findViewById(R.id.imageView);
                    } else {
                        imageView2 = null;
                    }
                    if (imageView2 != null) {
                        imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    }
                    if (imageView2 != null) {
                        imageView2.setImageBitmap(HabiticaIconsHelper.imageOfExperienceReward());
                    }
                    if (viewGroup2 != null) {
                        textView2 = (TextView) viewGroup2.findViewById(R.id.titleTextView);
                    } else {
                        textView2 = null;
                    }
                    if (textView2 != null) {
                        Context context = getContext();
                        Object[] objArr = new Object[1];
                        QuestDrops drop5 = questContent.getDrop();
                        if (drop5 != null) {
                            num = Integer.valueOf(drop5.getExp());
                        } else {
                            num = null;
                        }
                        objArr[0] = num;
                        textView2.setText(context.getString(R.string.experience_reward, objArr));
                    }
                    this.binding.rewardsList.addView(viewGroup2);
                }
                QuestDrops drop6 = questContent.getDrop();
                if (drop6 != null) {
                    i12 = drop6.getGp();
                } else {
                    i12 = 0;
                }
                if (i12 > 0) {
                    if (layoutInflater != null) {
                        view = layoutInflater.inflate(R.layout.row_quest_reward_imageview, (ViewGroup) this.binding.rewardsList, false);
                    } else {
                        view = null;
                    }
                    if (view instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        imageView = (ImageView) viewGroup.findViewById(R.id.imageView);
                    } else {
                        imageView = null;
                    }
                    if (imageView != null) {
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                    }
                    if (imageView != null) {
                        imageView.setImageBitmap(HabiticaIconsHelper.imageOfGoldReward());
                    }
                    if (viewGroup != null) {
                        textView = (TextView) viewGroup.findViewById(R.id.titleTextView);
                    } else {
                        textView = null;
                    }
                    if (textView != null) {
                        Context context2 = getContext();
                        Object[] objArr2 = new Object[1];
                        QuestDrops drop7 = questContent.getDrop();
                        if (drop7 != null) {
                            num3 = Integer.valueOf(drop7.getGp());
                        }
                        objArr2[0] = num3;
                        textView.setText(context2.getString(R.string.gold_reward, objArr2));
                    }
                    this.binding.rewardsList.addView(viewGroup);
                }
            }
        }
    }
}
