package com.habitrpg.android.habitica.ui.viewHolders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.v0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.PartyMemberBinding;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.ui.views.AppHeaderViewKt;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.UsernameLabel;
import com.habitrpg.common.habitica.views.AvatarView;
import com.habitrpg.common.habitica.views.HabiticaProgressBar;
import dc.w;
import qc.q;

/* compiled from: GroupMemberViewHolder.kt */
/* loaded from: classes4.dex */
public final class GroupMemberViewHolder extends RecyclerView.f0 implements v0.c {
    public static final int $stable = 8;
    private final PartyMemberBinding binding;
    private String currentUserID;
    private String leaderID;
    private pc.a<w> onClickEvent;
    private pc.a<w> removeMemberEvent;
    private pc.a<w> sendMessageEvent;
    private pc.a<w> transferOwnershipEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberViewHolder(View view) {
        super(view);
        q.i(view, "itemView");
        PartyMemberBinding bind = PartyMemberBinding.bind(view);
        q.h(bind, "bind(...)");
        this.binding = bind;
        bind.buffIconView.setImageBitmap(HabiticaIconsHelper.imageOfBuffIcon());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GroupMemberViewHolder._init_$lambda$0(GroupMemberViewHolder.this, view2);
            }
        });
        bind.moreButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.viewHolders.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GroupMemberViewHolder._init_$lambda$1(GroupMemberViewHolder.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(GroupMemberViewHolder groupMemberViewHolder, View view) {
        q.i(groupMemberViewHolder, "this$0");
        pc.a<w> aVar = groupMemberViewHolder.onClickEvent;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(GroupMemberViewHolder groupMemberViewHolder, View view) {
        q.i(groupMemberViewHolder, "this$0");
        groupMemberViewHolder.showOptionsPopup();
    }

    private final void showOptionsPopup() {
        v0 v0Var = new v0(this.itemView.getContext(), this.binding.moreButton);
        v0Var.c(this);
        MenuInflater b10 = v0Var.b();
        q.h(b10, "getMenuInflater(...)");
        b10.inflate(R.menu.party_member_menu, v0Var.a());
        v0Var.a().findItem(R.id.transfer_ownership).setVisible(q.d(this.currentUserID, this.leaderID));
        v0Var.a().findItem(R.id.remove).setVisible(q.d(this.currentUserID, this.leaderID));
        v0Var.d();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @SuppressLint({"SetTextI18n"})
    public final void bind(Member member, String str, String str2) {
        String str3;
        int i10;
        Integer num;
        boolean z10;
        Integer num2;
        String str4;
        double d10;
        double d11;
        Integer num3;
        double d12;
        double d13;
        Integer num4;
        double d14;
        Integer num5;
        q.i(member, "user");
        AvatarView avatarView = this.binding.avatarView;
        q.h(avatarView, "avatarView");
        String str5 = null;
        AvatarView.setAvatar$default(avatarView, member, null, 2, null);
        this.leaderID = str;
        this.currentUserID = str2;
        if (q.d(member.getId(), str2)) {
            this.binding.youPill.setVisibility(0);
            this.binding.moreButton.setVisibility(8);
        } else {
            this.binding.youPill.setVisibility(8);
            this.binding.moreButton.setVisibility(0);
        }
        Stats stats = member.getStats();
        if (stats != null) {
            HabiticaProgressBar habiticaProgressBar = this.binding.healthBar;
            Double hp = stats.getHp();
            double d15 = 0.0d;
            if (hp != null) {
                d10 = hp.doubleValue();
            } else {
                d10 = 0.0d;
            }
            Integer maxHealth = stats.getMaxHealth();
            if (maxHealth != null) {
                d11 = maxHealth.intValue();
            } else {
                d11 = 50.0d;
            }
            habiticaProgressBar.set(d10, d11);
            TextView textView = this.binding.healthTextview;
            Double hp2 = stats.getHp();
            if (hp2 != null) {
                num3 = Integer.valueOf((int) hp2.doubleValue());
            } else {
                num3 = null;
            }
            textView.setText(num3 + " / " + stats.getMaxHealth());
            HabiticaProgressBar habiticaProgressBar2 = this.binding.experienceBar;
            Double exp = stats.getExp();
            if (exp != null) {
                d12 = exp.doubleValue();
            } else {
                d12 = 0.0d;
            }
            Integer toNextLevel = stats.getToNextLevel();
            if (toNextLevel != null) {
                d13 = toNextLevel.intValue();
            } else {
                d13 = 0.0d;
            }
            habiticaProgressBar2.set(d12, d13);
            TextView textView2 = this.binding.experienceTextview;
            Double exp2 = stats.getExp();
            if (exp2 != null) {
                num4 = Integer.valueOf((int) exp2.doubleValue());
            } else {
                num4 = null;
            }
            textView2.setText(num4 + " / " + stats.getToNextLevel());
            HabiticaProgressBar habiticaProgressBar3 = this.binding.manaBar;
            Double mp = stats.getMp();
            if (mp != null) {
                d14 = mp.doubleValue();
            } else {
                d14 = 0.0d;
            }
            Integer maxMP = stats.getMaxMP();
            if (maxMP != null) {
                d15 = maxMP.intValue();
            }
            habiticaProgressBar3.set(d14, d15);
            TextView textView3 = this.binding.manaTextview;
            Double mp2 = stats.getMp();
            if (mp2 != null) {
                num5 = Integer.valueOf((int) mp2.doubleValue());
            } else {
                num5 = null;
            }
            textView3.setText(num5 + " / " + stats.getMaxMP());
        }
        UsernameLabel usernameLabel = this.binding.displayNameTextview;
        Profile profile = member.getProfile();
        if (profile != null) {
            str3 = profile.getName();
        } else {
            str3 = null;
        }
        usernameLabel.setUsername(str3);
        UsernameLabel usernameLabel2 = this.binding.displayNameTextview;
        ContributorInfo contributor = member.getContributor();
        if (contributor != null) {
            i10 = contributor.getLevel();
        } else {
            i10 = 0;
        }
        usernameLabel2.setTier(i10);
        if (member.getHasClass()) {
            TextView textView4 = this.binding.sublineTextview;
            Context context = this.itemView.getContext();
            Object[] objArr = new Object[2];
            Stats stats2 = member.getStats();
            if (stats2 != null) {
                num2 = stats2.getLvl();
            } else {
                num2 = null;
            }
            objArr[0] = num2;
            Resources resources = this.itemView.getContext().getResources();
            q.h(resources, "getResources(...)");
            Stats stats3 = member.getStats();
            if (stats3 != null) {
                str4 = stats3.getHabitClass();
            } else {
                str4 = null;
            }
            objArr[1] = AppHeaderViewKt.getTranslatedClassName(resources, str4);
            textView4.setText(context.getString(R.string.user_level_with_class, objArr));
        } else {
            TextView textView5 = this.binding.sublineTextview;
            Context context2 = this.itemView.getContext();
            Object[] objArr2 = new Object[1];
            Stats stats4 = member.getStats();
            if (stats4 != null) {
                num = stats4.getLvl();
            } else {
                num = null;
            }
            objArr2[0] = num;
            textView5.setText(context2.getString(R.string.user_level, objArr2));
        }
        Stats stats5 = member.getStats();
        if (stats5 != null && stats5.isBuffed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.binding.buffIconView.setVisibility(0);
        } else {
            this.binding.buffIconView.setVisibility(8);
        }
        this.binding.classIconView.setVisibility(0);
        Stats stats6 = member.getStats();
        if (stats6 != null) {
            str5 = stats6.getHabitClass();
        }
        if (str5 != null) {
            switch (str5.hashCode()) {
                case -1221263211:
                    if (str5.equals(Stats.HEALER)) {
                        this.binding.classIconView.setImageBitmap(HabiticaIconsHelper.imageOfHealerLightBg());
                        break;
                    }
                    break;
                case -787397269:
                    if (str5.equals(Stats.MAGE)) {
                        this.binding.classIconView.setImageBitmap(HabiticaIconsHelper.imageOfMageLightBg());
                        break;
                    }
                    break;
                case 108690906:
                    if (str5.equals(Stats.ROGUE)) {
                        this.binding.classIconView.setImageBitmap(HabiticaIconsHelper.imageOfRogueLightBg());
                        break;
                    }
                    break;
                case 1124565314:
                    if (str5.equals(Stats.WARRIOR)) {
                        this.binding.classIconView.setImageBitmap(HabiticaIconsHelper.imageOfWarriorLightBg());
                        break;
                    }
                    break;
            }
            this.itemView.setClickable(true);
        }
        this.binding.classIconView.setVisibility(4);
        this.itemView.setClickable(true);
    }

    public final pc.a<w> getOnClickEvent() {
        return this.onClickEvent;
    }

    public final pc.a<w> getRemoveMemberEvent() {
        return this.removeMemberEvent;
    }

    public final pc.a<w> getSendMessageEvent() {
        return this.sendMessageEvent;
    }

    public final pc.a<w> getTransferOwnershipEvent() {
        return this.transferOwnershipEvent;
    }

    @Override // androidx.appcompat.widget.v0.c
    public boolean onMenuItemClick(MenuItem menuItem) {
        Integer num;
        pc.a<w> aVar;
        if (menuItem != null) {
            num = Integer.valueOf(menuItem.getItemId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.send_message) {
            pc.a<w> aVar2 = this.sendMessageEvent;
            if (aVar2 != null) {
                aVar2.invoke();
                return true;
            }
            return true;
        } else if (num != null && num.intValue() == R.id.transfer_ownership) {
            pc.a<w> aVar3 = this.transferOwnershipEvent;
            if (aVar3 != null) {
                aVar3.invoke();
                return true;
            }
            return true;
        } else if (num != null && num.intValue() == R.id.remove && (aVar = this.removeMemberEvent) != null) {
            aVar.invoke();
            return true;
        } else {
            return true;
        }
    }

    public final void setOnClickEvent(pc.a<w> aVar) {
        this.onClickEvent = aVar;
    }

    public final void setRemoveMemberEvent(pc.a<w> aVar) {
        this.removeMemberEvent = aVar;
    }

    public final void setSendMessageEvent(pc.a<w> aVar) {
        this.sendMessageEvent = aVar;
    }

    public final void setTransferOwnershipEvent(pc.a<w> aVar) {
        this.transferOwnershipEvent = aVar;
    }
}
