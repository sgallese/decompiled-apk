package com.habitrpg.android.habitica.ui.views.social;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.QuestCollectBinding;
import com.habitrpg.android.habitica.databinding.QuestProgressBinding;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestBoss;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import com.habitrpg.android.habitica.models.inventory.QuestColors;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestProgressCollect;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.views.HabiticaIcons;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.NPCBannerView;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import com.habitrpg.common.habitica.views.ValueBar;
import java.util.List;
import qc.q;

/* compiled from: QuestProgressView.kt */
/* loaded from: classes4.dex */
public final class QuestProgressView extends LinearLayout {
    public static final int $stable = 8;
    private final QuestProgressBinding binding;
    private final float displayDensity;
    private SharedPreferences preferences;
    private Quest progress;
    private QuestContent quest;
    private final RectF rect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestProgressView(Context context) {
        super(context);
        q.i(context, "context");
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        QuestProgressBinding inflate = QuestProgressBinding.inflate(ContextExtensionsKt.getLayoutInflater(context2), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.rect = new RectF();
        this.displayDensity = getContext().getResources().getDisplayMetrics().density;
        setupView(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r2.getHasRage() == true) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void configure() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.social.QuestProgressView.configure():void");
    }

    private final String getLocationName(String str) {
        switch (str.hashCode()) {
            case -1782896904:
                if (str.equals("questShop")) {
                    String string = getContext().getString(R.string.questShop);
                    q.h(string, "getString(...)");
                    return string;
                }
                break;
            case -1081306052:
                if (str.equals("market")) {
                    String string2 = getContext().getString(R.string.market);
                    q.h(string2, "getString(...)");
                    return string2;
                }
                break;
            case -892499141:
                if (str.equals(NavigationDrawerFragment.SIDEBAR_STABLE)) {
                    String string3 = getContext().getString(R.string.sidebar_stable);
                    q.h(string3, "getString(...)");
                    return string3;
                }
                break;
            case -825703836:
                if (str.equals("seasonalShop")) {
                    String string4 = getContext().getString(R.string.seasonalShop);
                    q.h(string4, "getString(...)");
                    return string4;
                }
                break;
        }
        return "";
    }

    private final String getLongNPCName(String str) {
        switch (str.hashCode()) {
            case -1782896904:
                if (str.equals("questShop")) {
                    String string = getContext().getString(R.string.questShop_owner_long);
                    q.h(string, "getString(...)");
                    return string;
                }
                break;
            case -1081306052:
                if (str.equals("market")) {
                    String string2 = getContext().getString(R.string.market_owner_long);
                    q.h(string2, "getString(...)");
                    return string2;
                }
                break;
            case -892499141:
                if (str.equals(NavigationDrawerFragment.SIDEBAR_STABLE)) {
                    String string3 = getContext().getString(R.string.stable_owner_long);
                    q.h(string3, "getString(...)");
                    return string3;
                }
                break;
            case -880788200:
                if (str.equals("tavern")) {
                    String string4 = getContext().getString(R.string.tavern_owner_long);
                    q.h(string4, "getString(...)");
                    return string4;
                }
                break;
            case -825703836:
                if (str.equals("seasonalShop")) {
                    String string5 = getContext().getString(R.string.seasonalShop_owner_long);
                    q.h(string5, "getString(...)");
                    return string5;
                }
                break;
        }
        return "";
    }

    private final void hideQuestImage() {
        this.binding.questImageWrapper.setVisibility(8);
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("boss_art_collapsed", true);
            edit.apply();
        }
        updateCaretImage();
    }

    private final void setCollectionViews(List<? extends QuestProgressCollect> list, QuestContent questContent) {
        LayoutInflater from = LayoutInflater.from(getContext());
        for (QuestProgressCollect questProgressCollect : list) {
            QuestCollect collectWithKey = questContent.getCollectWithKey(questProgressCollect.getKey());
            if (collectWithKey != null) {
                QuestCollectBinding inflate = QuestCollectBinding.inflate(from, this.binding.collectionContainer, true);
                q.h(inflate, "inflate(...)");
                PixelArtView pixelArtView = inflate.iconView;
                q.h(pixelArtView, "iconView");
                DataBindingUtilsKt.loadImage$default(pixelArtView, "quest_" + questContent.getKey() + "_" + questProgressCollect.getKey(), null, 2, null);
                inflate.nameView.setText(collectWithKey.getText());
                inflate.valueView.set((double) questProgressCollect.getCount(), (double) collectWithKey.getCount());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r0 = ec.b0.x0(r0, new com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$$inlined$sortedByDescending$1());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupRageStrikeViews() {
        /*
            r9 = this;
            com.habitrpg.android.habitica.databinding.QuestProgressBinding r0 = r9.binding
            android.widget.TextView r0 = r0.rageStrikeDescriptionView
            r1 = 0
            r0.setVisibility(r1)
            com.habitrpg.android.habitica.databinding.QuestProgressBinding r0 = r9.binding
            android.widget.TextView r0 = r0.rageStrikeDescriptionView
            android.content.Context r2 = r9.getContext()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.habitrpg.android.habitica.models.inventory.Quest r4 = r9.progress
            if (r4 == 0) goto L20
            int r4 = r4.getActiveRageStrikeNumber()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L21
        L20:
            r4 = 0
        L21:
            r3[r1] = r4
            com.habitrpg.android.habitica.models.inventory.Quest r4 = r9.progress
            if (r4 == 0) goto L32
            io.realm.x0 r4 = r4.getRageStrikes()
            if (r4 == 0) goto L32
            int r4 = r4.size()
            goto L33
        L32:
            r4 = 0
        L33:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            r4 = 2131952923(0x7f13051b, float:1.9542302E38)
            java.lang.String r2 = r2.getString(r4, r3)
            r0.setText(r2)
            com.habitrpg.android.habitica.databinding.QuestProgressBinding r0 = r9.binding
            android.widget.LinearLayout r0 = r0.rageStrikeContainer
            r0.removeAllViews()
            com.habitrpg.android.habitica.models.inventory.Quest r0 = r9.progress
            if (r0 == 0) goto Lda
            io.realm.x0 r0 = r0.getRageStrikes()
            if (r0 == 0) goto Lda
            com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$$inlined$sortedByDescending$1 r2 = new com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$$inlined$sortedByDescending$1
            r2.<init>()
            java.util.List r0 = ec.r.x0(r0, r2)
            if (r0 == 0) goto Lda
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lda
            java.lang.Object r2 = r0.next()
            com.habitrpg.android.habitica.models.inventory.QuestRageStrike r2 = (com.habitrpg.android.habitica.models.inventory.QuestRageStrike) r2
            android.widget.ImageView r3 = new android.widget.ImageView
            android.content.Context r4 = r9.getContext()
            r3.<init>(r4)
            boolean r4 = r2.getWasHit()
            if (r4 == 0) goto Laa
            com.habitrpg.common.habitica.extensions.DataBindingUtils r4 = com.habitrpg.common.habitica.extensions.DataBindingUtils.INSTANCE
            android.content.Context r5 = r9.getContext()
            java.lang.String r6 = "getContext(...)"
            qc.q.h(r5, r6)
            java.lang.String r6 = r2.getKey()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "rage_strike_"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$2$1 r7 = new com.habitrpg.android.habitica.ui.views.social.QuestProgressView$setupRageStrikeViews$2$1
            r7.<init>(r9, r3, r2)
            r4.loadImage(r5, r6, r7)
            goto Lb9
        Laa:
            android.graphics.Bitmap r2 = com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper.imageOfRageStrikeInactive()
            r3.setImageBitmap(r2)
            com.habitrpg.android.habitica.ui.views.social.i r2 = new com.habitrpg.android.habitica.ui.views.social.i
            r2.<init>()
            r3.setOnClickListener(r2)
        Lb9:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r2.<init>(r4, r4)
            android.content.Context r4 = r9.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131166065(0x7f070371, float:1.7946365E38)
            float r4 = r4.getDimension(r5)
            int r4 = (int) r4
            r2.setMargins(r4, r1, r4, r1)
            com.habitrpg.android.habitica.databinding.QuestProgressBinding r4 = r9.binding
            android.widget.LinearLayout r4 = r4.rageStrikeContainer
            r4.addView(r3, r2)
            goto L66
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.social.QuestProgressView.setupRageStrikeViews():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupRageStrikeViews$lambda$4$lambda$3(QuestProgressView questProgressView, View view) {
        q.i(questProgressView, "this$0");
        questProgressView.showPendingStrikeAlert();
    }

    private final void setupView(Context context) {
        boolean z10 = false;
        setWillNotDraw(false);
        this.binding.caretView.setImageBitmap(HabiticaIconsHelper.imageOfCaret(androidx.core.content.a.c(context, R.color.white), true));
        this.binding.questImageTitle.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuestProgressView.setupView$lambda$0(QuestProgressView.this, view);
            }
        });
        this.binding.pendingDamageIconView.setImageBitmap(HabiticaIconsHelper.imageOfDamage());
        ValueBar valueBar = this.binding.bossHealthView;
        Bitmap imageOfHeartDarkBg = HabiticaIconsHelper.imageOfHeartDarkBg();
        q.h(imageOfHeartDarkBg, "imageOfHeartDarkBg(...)");
        valueBar.setSecondaryIcon(imageOfHeartDarkBg);
        ValueBar valueBar2 = this.binding.bossRageView;
        Bitmap imageOfRage = HabiticaIconsHelper.imageOfRage();
        q.h(imageOfRage, "imageOfRage(...)");
        valueBar2.setSecondaryIcon(imageOfRage);
        this.binding.rageStrikeDescriptionView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QuestProgressView.setupView$lambda$1(QuestProgressView.this, view);
            }
        });
        this.binding.questDescriptionSection.setCaretOffset((int) (12 * getResources().getDisplayMetrics().density));
        SharedPreferences sharedPreferences = context.getSharedPreferences("collapsible_sections", 0);
        this.preferences = sharedPreferences;
        if (sharedPreferences != null && sharedPreferences.getBoolean("boss_art_collapsed", false)) {
            z10 = true;
        }
        if (z10) {
            hideQuestImage();
        } else {
            showQuestImage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupView$lambda$0(QuestProgressView questProgressView, View view) {
        q.i(questProgressView, "this$0");
        if (questProgressView.binding.questImageWrapper.getVisibility() == 0) {
            questProgressView.hideQuestImage();
        } else {
            questProgressView.showQuestImage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupView$lambda$1(QuestProgressView questProgressView, View view) {
        q.i(questProgressView, "this$0");
        questProgressView.showStrikeDescriptionAlert();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showActiveStrikeAlert(String str) {
        String str2;
        String key;
        QuestBoss boss;
        Context context = getContext();
        q.h(context, "getContext(...)");
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(getContext().getString(R.string.strike_active_title, getLocationName(str)));
        Context context2 = getContext();
        Object[] objArr = new Object[3];
        objArr[0] = getLongNPCName(str);
        QuestContent questContent = this.quest;
        String str3 = "";
        if (questContent == null || (boss = questContent.getBoss()) == null || (str2 = boss.getName()) == null) {
            str2 = "";
        }
        objArr[1] = str2;
        objArr[2] = getLocationName(str);
        habiticaAlertDialog.setMessage(context2.getString(R.string.strike_active_description, objArr));
        Context context3 = getContext();
        q.h(context3, "getContext(...)");
        NPCBannerView nPCBannerView = new NPCBannerView(context3, null);
        QuestContent questContent2 = this.quest;
        if (questContent2 != null && (key = questContent2.getKey()) != null) {
            str3 = key;
        }
        nPCBannerView.setShopSpriteSuffix(str3);
        nPCBannerView.setIdentifier(str);
        habiticaAlertDialog.setAdditionalContentView(nPCBannerView);
        habiticaAlertDialog.setButton(-1, getContext().getString(R.string.close), new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        });
        habiticaAlertDialog.show();
    }

    private final void showPendingStrikeAlert() {
        Context context = getContext();
        q.h(context, "getContext(...)");
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(R.string.pending_strike_title);
        habiticaAlertDialog.setButton(-1, getContext().getString(R.string.close), new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        });
        habiticaAlertDialog.show();
    }

    private final void showQuestImage() {
        String str;
        this.binding.questImageWrapper.setVisibility(0);
        PixelArtView pixelArtView = this.binding.questImageView;
        q.h(pixelArtView, "questImageView");
        QuestContent questContent = this.quest;
        if (questContent != null) {
            str = questContent.getKey();
        } else {
            str = null;
        }
        DataBindingUtilsKt.loadImage$default(pixelArtView, "quest_" + str, null, 2, null);
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("boss_art_collapsed", false);
            edit.apply();
        }
        updateCaretImage();
    }

    private final void showStrikeDescriptionAlert() {
        Context context = getContext();
        q.h(context, "getContext(...)");
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
        habiticaAlertDialog.setTitle(R.string.strike_description_title);
        habiticaAlertDialog.setButton(-1, getContext().getString(R.string.close), new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        });
        habiticaAlertDialog.show();
    }

    private final void updateCaretImage() {
        int i10;
        QuestColors colors;
        QuestColors colors2;
        int i11 = 0;
        if (this.binding.questImageWrapper.getVisibility() == 0) {
            ImageView imageView = this.binding.caretView;
            QuestContent questContent = this.quest;
            if (questContent != null && (colors2 = questContent.getColors()) != null) {
                i11 = colors2.getExtraLightColor();
            }
            imageView.setImageBitmap(HabiticaIconsHelper.imageOfCaret(i11, true));
            return;
        }
        ImageView imageView2 = this.binding.caretView;
        QuestContent questContent2 = this.quest;
        if (questContent2 != null && (colors = questContent2.getColors()) != null) {
            i10 = colors.getExtraLightColor();
        } else {
            i10 = 0;
        }
        imageView2.setImageBitmap(HabiticaIconsHelper.imageOfCaret(i10, false));
    }

    public final Quest getProgress() {
        return this.progress;
    }

    public final QuestContent getQuest() {
        return this.quest;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        QuestColors questColors;
        q.i(canvas, "canvas");
        QuestContent questContent = this.quest;
        boolean z10 = false;
        if (questContent != null && questContent.isValid()) {
            z10 = true;
        }
        if (z10) {
            QuestContent questContent2 = this.quest;
            if (questContent2 != null) {
                questColors = questContent2.getColors();
            } else {
                questColors = null;
            }
            if (questColors != null) {
                this.rect.set(0.0f, 0.0f, getWidth() / this.displayDensity, getHeight() / this.displayDensity);
                float f10 = this.displayDensity;
                canvas.scale(f10, f10);
                HabiticaIcons.drawQuestBackground(canvas, this.rect, questColors.getDarkColor(), questColors.getMediumColor(), questColors.getExtraLightColor());
                float f11 = this.displayDensity;
                canvas.scale(1.0f / f11, 1.0f / f11);
            }
        }
        super.onDraw(canvas);
    }

    public final void setProgress(Quest quest) {
        this.progress = quest;
        configure();
    }

    public final void setQuest(QuestContent questContent) {
        this.quest = questContent;
        configure();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        QuestProgressBinding inflate = QuestProgressBinding.inflate(ContextExtensionsKt.getLayoutInflater(context2), this, true);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.rect = new RectF();
        this.displayDensity = getContext().getResources().getDisplayMetrics().density;
        setupView(context);
    }

    public final void configure(User user) {
        Quest quest;
        QuestProgress progress;
        Quest quest2;
        QuestProgress progress2;
        q.i(user, "user");
        TextView textView = this.binding.pendingDamageTextView;
        Context context = getContext();
        Object[] objArr = new Object[1];
        UserParty party = user.getParty();
        objArr[0] = Float.valueOf((party == null || (quest2 = party.getQuest()) == null || (progress2 = quest2.getProgress()) == null) ? 0.0f : progress2.getUp());
        textView.setText(context.getString(R.string.damage_pending, objArr));
        UserParty party2 = user.getParty();
        this.binding.collectedItemsNumberView.setText(getContext().getString(R.string.quest_items_found, Integer.valueOf((party2 == null || (quest = party2.getQuest()) == null || (progress = quest.getProgress()) == null) ? 0 : progress.getCollectedItems())));
    }
}
