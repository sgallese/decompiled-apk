package com.habitrpg.android.habitica.ui.views.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.DialogCompletedQuestContentBinding;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.QuestDropItem;
import com.habitrpg.android.habitica.models.inventory.QuestDrops;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import ec.t;
import io.realm.x0;
import java.util.ArrayList;
import java.util.List;
import qc.q;

/* compiled from: QuestCompletedDialogContent.kt */
/* loaded from: classes4.dex */
public final class QuestCompletedDialogContent extends LinearLayout {
    public static final int $stable = 8;
    private DialogCompletedQuestContentBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestCompletedDialogContent(Context context) {
        super(context);
        q.i(context, "context");
        setupView();
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

    private final void setupView() {
        setOrientation(1);
        setGravity(17);
        Context context = getContext();
        q.h(context, "getContext(...)");
        DialogCompletedQuestContentBinding inflate = DialogCompletedQuestContentBinding.inflate(ContextExtensionsKt.getLayoutInflater(context), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final void setQuestContent(QuestContent questContent) {
        LayoutInflater layoutInflater;
        x0<QuestDropItem> x0Var;
        List<QuestDropItem> i10;
        int i11;
        int i12;
        View view;
        ViewGroup viewGroup;
        ImageView imageView;
        TextView textView;
        Integer num;
        View view2;
        ViewGroup viewGroup2;
        ImageView imageView2;
        TextView textView2;
        Integer num2;
        x0<QuestDropItem> items;
        q.i(questContent, "questContent");
        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding = this.binding;
        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding2 = null;
        if (dialogCompletedQuestContentBinding == null) {
            q.z("binding");
            dialogCompletedQuestContentBinding = null;
        }
        dialogCompletedQuestContentBinding.titleTextView.setText(StringExtensionsKt.fromHtml(questContent.getText()), TextView.BufferType.SPANNABLE);
        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding3 = this.binding;
        if (dialogCompletedQuestContentBinding3 == null) {
            q.z("binding");
            dialogCompletedQuestContentBinding3 = null;
        }
        dialogCompletedQuestContentBinding3.notesTextView.setText(StringExtensionsKt.fromHtml(questContent.getCompletion()), TextView.BufferType.SPANNABLE);
        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding4 = this.binding;
        if (dialogCompletedQuestContentBinding4 == null) {
            q.z("binding");
            dialogCompletedQuestContentBinding4 = null;
        }
        PixelArtView pixelArtView = dialogCompletedQuestContentBinding4.imageView;
        q.h(pixelArtView, "imageView");
        DataBindingUtilsKt.loadImage$default(pixelArtView, "quest_" + questContent.getKey(), null, 2, null);
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
                        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding5 = this.binding;
                        if (dialogCompletedQuestContentBinding5 == null) {
                            q.z("binding");
                            dialogCompletedQuestContentBinding5 = null;
                        }
                        addRewardsRow(layoutInflater, questDropItem2, dialogCompletedQuestContentBinding5.rewardsList);
                    }
                }
                QuestDrops drop3 = questContent.getDrop();
                if (drop3 == null || (i10 = drop3.getItems()) == null) {
                    i10 = t.i();
                }
                boolean z10 = false;
                for (QuestDropItem questDropItem3 : i10) {
                    if (questDropItem3.getOnlyOwner()) {
                        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding6 = this.binding;
                        if (dialogCompletedQuestContentBinding6 == null) {
                            q.z("binding");
                            dialogCompletedQuestContentBinding6 = null;
                        }
                        addRewardsRow(layoutInflater, questDropItem3, dialogCompletedQuestContentBinding6.ownerRewardsList);
                        z10 = true;
                    }
                }
                if (!z10) {
                    DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding7 = this.binding;
                    if (dialogCompletedQuestContentBinding7 == null) {
                        q.z("binding");
                        dialogCompletedQuestContentBinding7 = null;
                    }
                    dialogCompletedQuestContentBinding7.ownerRewardsTitle.setVisibility(8);
                    DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding8 = this.binding;
                    if (dialogCompletedQuestContentBinding8 == null) {
                        q.z("binding");
                        dialogCompletedQuestContentBinding8 = null;
                    }
                    dialogCompletedQuestContentBinding8.ownerRewardsList.setVisibility(8);
                }
                QuestDrops drop4 = questContent.getDrop();
                if (drop4 != null) {
                    i11 = drop4.getExp();
                } else {
                    i11 = 0;
                }
                if (i11 > 0) {
                    if (layoutInflater != null) {
                        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding9 = this.binding;
                        if (dialogCompletedQuestContentBinding9 == null) {
                            q.z("binding");
                            dialogCompletedQuestContentBinding9 = null;
                        }
                        view2 = layoutInflater.inflate(R.layout.row_quest_reward_imageview, (ViewGroup) dialogCompletedQuestContentBinding9.rewardsList, false);
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
                            num2 = Integer.valueOf(drop5.getExp());
                        } else {
                            num2 = null;
                        }
                        objArr[0] = num2;
                        textView2.setText(context.getString(R.string.experience_reward, objArr));
                    }
                    DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding10 = this.binding;
                    if (dialogCompletedQuestContentBinding10 == null) {
                        q.z("binding");
                        dialogCompletedQuestContentBinding10 = null;
                    }
                    dialogCompletedQuestContentBinding10.rewardsList.addView(viewGroup2);
                }
                QuestDrops drop6 = questContent.getDrop();
                if (drop6 != null) {
                    i12 = drop6.getGp();
                } else {
                    i12 = 0;
                }
                if (i12 > 0) {
                    if (layoutInflater != null) {
                        DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding11 = this.binding;
                        if (dialogCompletedQuestContentBinding11 == null) {
                            q.z("binding");
                            dialogCompletedQuestContentBinding11 = null;
                        }
                        view = layoutInflater.inflate(R.layout.row_quest_reward_imageview, (ViewGroup) dialogCompletedQuestContentBinding11.rewardsList, false);
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
                            num = Integer.valueOf(drop7.getGp());
                        } else {
                            num = null;
                        }
                        objArr2[0] = num;
                        textView.setText(context2.getString(R.string.gold_reward, objArr2));
                    }
                    DialogCompletedQuestContentBinding dialogCompletedQuestContentBinding12 = this.binding;
                    if (dialogCompletedQuestContentBinding12 == null) {
                        q.z("binding");
                    } else {
                        dialogCompletedQuestContentBinding2 = dialogCompletedQuestContentBinding12;
                    }
                    dialogCompletedQuestContentBinding2.rewardsList.addView(viewGroup);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestCompletedDialogContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        setupView();
    }
}
