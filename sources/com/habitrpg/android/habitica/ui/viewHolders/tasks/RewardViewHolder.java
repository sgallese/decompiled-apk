package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.RewardItemCardBinding;
import com.habitrpg.android.habitica.helpers.GroupPlanInfoProvider;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.helpers.NumberAbbreviator;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import pc.l;
import pc.p;
import qc.q;

/* compiled from: RewardViewHolder.kt */
/* loaded from: classes4.dex */
public final class RewardViewHolder extends BaseTaskViewHolder {
    public static final int $stable = 8;
    private final RewardItemCardBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardViewHolder(View view, p<? super Task, ? super TaskDirection, w> pVar, l<? super dc.l<? extends Task, ? extends View>, w> lVar, l<? super Task, w> lVar2, GroupPlanInfoProvider groupPlanInfoProvider) {
        super(view, pVar, lVar, lVar2, groupPlanInfoProvider);
        q.i(view, "itemView");
        q.i(pVar, "scoreTaskFunc");
        q.i(lVar, "openTaskFunc");
        q.i(lVar2, "brokenTaskFunc");
        RewardItemCardBinding bind = RewardItemCardBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
        bind.buyButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.tasks.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RewardViewHolder._init_$lambda$0(RewardViewHolder.this, view2);
            }
        });
        bind.goldIcon.setImageBitmap(HabiticaIconsHelper.imageOfGold());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(RewardViewHolder rewardViewHolder, View view) {
        q.i(rewardViewHolder, "this$0");
        rewardViewHolder.buyReward();
    }

    private final void buyReward() {
        Task task = getTask();
        if (task != null) {
            getScoreTaskFunc().invoke(task, TaskDirection.DOWN);
        }
    }

    public final void bind(Task task, int i10, boolean z10, String str, String str2) {
        double d10;
        String abbreviate;
        q.i(task, "reward");
        q.i(str, "displayMode");
        setTask(task);
        getStreakTextView().setVisibility(8);
        super.bind(task, i10, str, str2);
        TextView textView = this.binding.priceLabel;
        NumberAbbreviator numberAbbreviator = NumberAbbreviator.INSTANCE;
        Context context = this.itemView.getContext();
        Task task2 = getTask();
        if (task2 != null) {
            d10 = task2.getValue();
        } else {
            d10 = 0.0d;
        }
        abbreviate = numberAbbreviator.abbreviate(context, d10, (r12 & 4) != 0 ? 2 : 0, (r12 & 8) != 0 ? 0 : 0);
        textView.setText(abbreviate);
        if (isLocked()) {
            TextView textView2 = this.binding.priceLabel;
            Bitmap imageOfLocked = HabiticaIconsHelper.imageOfLocked(androidx.core.content.a.c(getContext(), R.color.gray_1_30), 10, 12);
            q.h(imageOfLocked, "imageOfLocked(...)");
            Resources resources = getContext().getResources();
            q.h(resources, "getResources(...)");
            textView2.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(resources, imageOfLocked), (Drawable) null, (Drawable) null, (Drawable) null);
            this.binding.priceLabel.setCompoundDrawablePadding(IntExtensionsKt.dpToPx(2, getContext()));
        } else {
            this.binding.priceLabel.setCompoundDrawables(null, null, null, null);
        }
        if (z10 && !isLocked()) {
            this.binding.goldIcon.setAlpha(1.0f);
            this.binding.priceLabel.setTextColor(androidx.core.content.a.c(getContext(), R.color.reward_buy_button_text));
            this.binding.buyButton.setBackgroundColor(androidx.core.content.a.c(getContext(), R.color.reward_buy_button_bg));
            return;
        }
        this.binding.goldIcon.setAlpha(0.6f);
        this.binding.priceLabel.setTextColor(androidx.core.content.a.c(getContext(), R.color.text_quad));
        this.binding.buyButton.setBackgroundColor(androidx.core.graphics.a.k(androidx.core.content.a.c(getContext(), R.color.offset_background), 127));
    }

    @Override // com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder
    public void setDisabled(boolean z10, boolean z11) {
        super.setDisabled(z10, z11);
        this.binding.buyButton.setEnabled(!z11);
    }
}
