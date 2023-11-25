package com.habitrpg.android.habitica.ui.views.social;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.QuestCollectBinding;
import com.habitrpg.android.habitica.databinding.QuestProgressOldBinding;
import com.habitrpg.android.habitica.extensions.ViewExtKt;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestBossRage;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestProgressCollect;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.common.habitica.views.ValueBar;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: OldQuestProgressView.kt */
/* loaded from: classes4.dex */
public final class OldQuestProgressView extends LinearLayout {
    public static final int $stable = 8;
    private final QuestProgressOldBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldQuestProgressView(Context context) {
        super(context);
        q.i(context, "context");
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        QuestProgressOldBinding inflate = QuestProgressOldBinding.inflate(ContextExtensionsKt.getLayoutInflater(context2), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setupView(context);
    }

    private final void setupView(Context context) {
        setOrientation(1);
        this.binding.bossHealthView.setValueSuffix("HP");
        this.binding.bossRageView.setValueSuffix(context.getString(R.string.rage));
        ValueBar valueBar = this.binding.bossHealthView;
        ViewExtKt.setScaledPadding(this, context, 16, 16, 16, 16);
    }

    public final void setData(QuestContent questContent, QuestProgress questProgress) {
        String str;
        double d10;
        QuestBossRage rage;
        QuestBossRage rage2;
        double d11;
        q.i(questContent, "quest");
        this.binding.collectionContainer.removeAllViews();
        boolean z10 = true;
        String str2 = null;
        if (questContent.isBossQuest()) {
            TextView textView = this.binding.bossNameView;
            QuestBoss boss = questContent.getBoss();
            if (boss != null) {
                str = boss.getName();
            } else {
                str = null;
            }
            textView.setText(str);
            this.binding.bossHealthView.setBarHeight(Integer.valueOf(IntExtensionsKt.dpToPx(5, getContext())));
            double d12 = 0.0d;
            if (questProgress != null) {
                ValueBar valueBar = this.binding.bossHealthView;
                double hp = questProgress.getHp();
                QuestBoss boss2 = questContent.getBoss();
                if (boss2 != null) {
                    d11 = boss2.getHp();
                } else {
                    d11 = 0.0d;
                }
                valueBar.set(hp, d11);
            }
            QuestBoss boss3 = questContent.getBoss();
            if (boss3 == null || !boss3.getHasRage()) {
                z10 = false;
            }
            if (z10) {
                this.binding.bossRageWrapper.setVisibility(0);
                this.binding.bossRageView.setBarHeight(Integer.valueOf(IntExtensionsKt.dpToPx(5, getContext())));
                ValueBar valueBar2 = this.binding.bossRageView;
                if (questProgress != null) {
                    d10 = questProgress.getRage();
                } else {
                    d10 = 0.0d;
                }
                QuestBoss boss4 = questContent.getBoss();
                if (boss4 != null && (rage2 = boss4.getRage()) != null) {
                    d12 = rage2.getValue();
                }
                valueBar2.set(d10, d12);
                TextView textView2 = this.binding.bossRageNameView;
                QuestBoss boss5 = questContent.getBoss();
                if (boss5 != null && (rage = boss5.getRage()) != null) {
                    str2 = rage.getTitle();
                }
                textView2.setText(str2);
            } else {
                this.binding.bossRageWrapper.setVisibility(8);
            }
            this.binding.bossHealthWrapper.setVisibility(0);
            return;
        }
        this.binding.bossHealthWrapper.setVisibility(8);
        this.binding.bossRageWrapper.setVisibility(8);
        if (questProgress != null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            List<QuestProgressCollect> collect = questProgress.getCollect();
            if (collect == null) {
                collect = t.i();
            }
            for (QuestProgressCollect questProgressCollect : collect) {
                QuestCollect collectWithKey = questContent.getCollectWithKey(questProgressCollect.getKey());
                if (collectWithKey != null) {
                    QuestCollectBinding inflate = QuestCollectBinding.inflate(from, this.binding.collectionContainer, true);
                    q.h(inflate, "inflate(...)");
                    PixelArtView pixelArtView = inflate.iconView;
                    q.h(pixelArtView, "iconView");
                    DataBindingUtilsKt.loadImage$default(pixelArtView, "quest_" + questContent.getKey() + "_" + questProgressCollect.getKey(), null, 2, null);
                    inflate.nameView.setText(collectWithKey.getText());
                    inflate.valueView.set((double) questProgressCollect.getCount(), (double) collectWithKey.getCount());
                    inflate.valueView.setBarHeight(Integer.valueOf(IntExtensionsKt.dpToPx(5, getContext())));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OldQuestProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        QuestProgressOldBinding inflate = QuestProgressOldBinding.inflate(ContextExtensionsKt.getLayoutInflater(context2), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        setupView(context);
    }
}
