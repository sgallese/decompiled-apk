package com.habitrpg.android.habitica.ui.fragments.social;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentQuestDetailBinding;
import com.habitrpg.android.habitica.helpers.HapticFeedbackManager;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestContent;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.extensions.StringExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MarkdownParser;
import com.habitrpg.common.habitica.views.PixelArtView;
import ec.t;
import java.util.Iterator;
import java.util.List;
import pc.p;
import qc.q;

/* compiled from: QuestDetailFragment.kt */
/* loaded from: classes4.dex */
public final class QuestDetailFragment extends Hilt_QuestDetailFragment<FragmentQuestDetailBinding> {
    public static final int $stable = 8;
    private String beginQuestMessage;
    private FragmentQuestDetailBinding binding;
    public InventoryRepository inventoryRepository;
    private Group party;
    private Quest quest;
    public SocialRepository socialRepository;
    public MainUserViewModel userViewModel;

    private final boolean isQuestActive() {
        Quest quest = this.quest;
        if (quest == null || !quest.getActive()) {
            return false;
        }
        return true;
    }

    private final void onQuestBegin() {
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        View requireView = requireView();
        q.h(requireView, "requireView(...)");
        companion.tap(requireView);
        Context context = getContext();
        if (context != null) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setMessage(this.beginQuestMessage);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.yes, true, false, false, (p) new QuestDetailFragment$onQuestBegin$1(this), 12, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.no, false, false, false, (p) null, 28, (Object) null);
            habiticaAlertDialog.show();
        }
    }

    private final void onQuestCancel() {
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        View requireView = requireView();
        q.h(requireView, "requireView(...)");
        companion.tap(requireView);
        Context context = getContext();
        if (context != null) {
            if (isQuestActive()) {
                new AlertDialog.Builder(getActivity()).setMessage(R.string.quest_abort_message).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        QuestDetailFragment.onQuestCancel$lambda$7$lambda$5(QuestDetailFragment.this, dialogInterface, i10);
                    }
                }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        QuestDetailFragment.onQuestCancel$lambda$7$lambda$6(dialogInterface, i10);
                    }
                }).show();
                return;
            }
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(context);
            habiticaAlertDialog.setMessage(R.string.quest_cancel_message);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.yes, true, false, false, (p) new QuestDetailFragment$onQuestCancel$1$1(this), 12, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.no, false, false, false, (p) null, 28, (Object) null);
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onQuestCancel$lambda$7$lambda$5(QuestDetailFragment questDetailFragment, DialogInterface dialogInterface, int i10) {
        String id2;
        q.i(questDetailFragment, "this$0");
        Group group = questDetailFragment.party;
        if (group != null && (id2 = group.getId()) != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(questDetailFragment), null, new QuestDetailFragment$onQuestCancel$1$builder$1$1$1(questDetailFragment, id2, null), 1, null);
        }
    }

    private final void onQuestLeave() {
        int i10;
        HapticFeedbackManager.Companion companion = HapticFeedbackManager.Companion;
        View requireView = requireView();
        q.h(requireView, "requireView(...)");
        companion.tap(requireView);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        Quest quest = this.quest;
        boolean z10 = false;
        if (quest != null && quest.getActive()) {
            z10 = true;
        }
        if (z10) {
            i10 = R.string.quest_leave_message;
        } else {
            i10 = R.string.quest_leave_message_nostart;
        }
        builder.setMessage(i10).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                QuestDetailFragment.onQuestLeave$lambda$9(QuestDetailFragment.this, dialogInterface, i11);
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                QuestDetailFragment.onQuestLeave$lambda$10(dialogInterface, i11);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onQuestLeave$lambda$9(QuestDetailFragment questDetailFragment, DialogInterface dialogInterface, int i10) {
        String id2;
        q.i(questDetailFragment, "this$0");
        Group group = questDetailFragment.party;
        if (group != null && (id2 = group.getId()) != null) {
            ExceptionHandlerKt.launchCatching$default(w.a(questDetailFragment), null, new QuestDetailFragment$onQuestLeave$builder$1$1$1(questDetailFragment, id2, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(QuestDetailFragment questDetailFragment, View view) {
        q.i(questDetailFragment, "this$0");
        questDetailFragment.onQuestBegin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(QuestDetailFragment questDetailFragment, View view) {
        q.i(questDetailFragment, "this$0");
        questDetailFragment.onQuestCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(QuestDetailFragment questDetailFragment, View view) {
        q.i(questDetailFragment, "this$0");
        questDetailFragment.onQuestLeave();
    }

    private final void setQuestParticipants(List<? extends Member> list) {
        LinearLayout linearLayout;
        Object obj;
        LayoutInflater layoutInflater;
        List<? extends Member> list2;
        boolean z10;
        TextView textView;
        Integer num;
        TextView textView2;
        TextView textView3;
        boolean z11;
        View view;
        View view2;
        TextView textView4;
        View view3;
        TextView textView5;
        FragmentQuestDetailBinding binding;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        FragmentQuestDetailBinding binding2 = getBinding();
        Integer num2 = null;
        TextView textView6 = null;
        if (binding2 != null) {
            linearLayout = binding2.questParticipantList;
        } else {
            linearLayout = null;
        }
        if (linearLayout == null) {
            return;
        }
        FragmentQuestDetailBinding binding3 = getBinding();
        if (binding3 != null && (linearLayout5 = binding3.questParticipantList) != null) {
            linearLayout5.removeAllViews();
        }
        Context context = getContext();
        if (context != null) {
            obj = context.getSystemService("layout_inflater");
        } else {
            obj = null;
        }
        if (obj instanceof LayoutInflater) {
            layoutInflater = (LayoutInflater) obj;
        } else {
            layoutInflater = null;
        }
        if (list == null) {
            list2 = t.i();
        } else {
            list2 = list;
        }
        Iterator<? extends Member> it = list2.iterator();
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (!it.hasNext()) {
                break;
            }
            Member next = it.next();
            Quest quest = this.quest;
            if (quest != null && quest.getActive()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 || !q.d(next.getParticipatesInQuest(), Boolean.FALSE)) {
                if (layoutInflater != null) {
                    FragmentQuestDetailBinding binding4 = getBinding();
                    if (binding4 != null) {
                        linearLayout4 = binding4.questParticipantList;
                    } else {
                        linearLayout4 = null;
                    }
                    view = layoutInflater.inflate(R.layout.quest_participant, (ViewGroup) linearLayout4, false);
                } else {
                    view = null;
                }
                if (view != null) {
                    view2 = view.findViewById(R.id.participant_name);
                } else {
                    view2 = null;
                }
                if (view2 instanceof TextView) {
                    textView4 = (TextView) view2;
                } else {
                    textView4 = null;
                }
                if (textView4 != null) {
                    textView4.setText(next.getDisplayName());
                }
                if (view != null) {
                    view3 = view.findViewById(R.id.status_view);
                } else {
                    view3 = null;
                }
                if (view3 instanceof TextView) {
                    textView5 = (TextView) view3;
                } else {
                    textView5 = null;
                }
                Quest quest2 = this.quest;
                if (quest2 == null || quest2.getActive()) {
                    z12 = false;
                }
                if (z12) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        Boolean participatesInQuest = next.getParticipatesInQuest();
                        if (participatesInQuest == null) {
                            if (textView5 != null) {
                                textView5.setText(R.string.pending);
                            }
                            if (textView5 != null) {
                                textView5.setTextColor(androidx.core.content.a.c(context2, R.color.text_ternary));
                            }
                        } else if (q.d(participatesInQuest, Boolean.TRUE)) {
                            if (textView5 != null) {
                                textView5.setText(R.string.accepted);
                            }
                            if (textView5 != null) {
                                textView5.setTextColor(androidx.core.content.a.c(context2, R.color.text_green));
                            }
                        } else {
                            if (textView5 != null) {
                                textView5.setText(R.string.declined);
                            }
                            if (textView5 != null) {
                                textView5.setTextColor(androidx.core.content.a.c(context2, R.color.text_red));
                            }
                        }
                    }
                    FragmentQuestDetailBinding binding5 = getBinding();
                    if (binding5 != null && (linearLayout3 = binding5.questParticipantList) != null) {
                        linearLayout3.addView(view);
                    }
                } else {
                    if (textView5 != null) {
                        textView5.setVisibility(8);
                    }
                    if (q.d(next.getParticipatesInQuest(), Boolean.TRUE) && (binding = getBinding()) != null && (linearLayout2 = binding.questParticipantList) != null) {
                        linearLayout2.addView(view);
                    }
                }
                if (q.d(next.getParticipatesInQuest(), Boolean.TRUE)) {
                    i10++;
                }
            }
        }
        Quest quest3 = this.quest;
        if (quest3 != null && quest3.getActive()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            FragmentQuestDetailBinding binding6 = getBinding();
            if (binding6 != null && (textView3 = binding6.participantsHeader) != null) {
                textView3.setText(R.string.participants);
            }
            FragmentQuestDetailBinding binding7 = getBinding();
            if (binding7 != null) {
                textView6 = binding7.participantsHeaderCount;
            }
            if (textView6 != null) {
                textView6.setText(String.valueOf(i10));
                return;
            }
            return;
        }
        FragmentQuestDetailBinding binding8 = getBinding();
        if (binding8 != null && (textView2 = binding8.participantsHeader) != null) {
            textView2.setText(R.string.invitations);
        }
        FragmentQuestDetailBinding binding9 = getBinding();
        if (binding9 != null) {
            textView = binding9.participantsHeaderCount;
        } else {
            textView = null;
        }
        if (textView != null) {
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            textView.setText(i10 + "/" + num);
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i10);
        if (list != null) {
            num2 = Integer.valueOf(list.size());
        }
        objArr[1] = num2;
        this.beginQuestMessage = getString(R.string.quest_begin_message, objArr);
    }

    private final boolean showLeaderButtons() {
        String str;
        Quest quest;
        String userID = getUserViewModel().getUserID();
        Group group = this.party;
        String str2 = null;
        if (group != null && (quest = group.getQuest()) != null) {
            str = quest.getLeader();
        } else {
            str = null;
        }
        if (!q.d(userID, str)) {
            String userID2 = getUserViewModel().getUserID();
            Group group2 = this.party;
            if (group2 != null) {
                str2 = group2.getLeaderID();
            }
            if (!q.d(userID2, str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateParty(com.habitrpg.android.habitica.models.social.Group r10) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.social.QuestDetailFragment.updateParty(com.habitrpg.android.habitica.models.social.Group):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateQuestContent(QuestContent questContent) {
        TextView textView;
        TextView textView2;
        PixelArtView pixelArtView;
        TextView textView3;
        FragmentQuestDetailBinding binding = getBinding();
        if (binding != null) {
            textView = binding.titleView;
        } else {
            textView = null;
        }
        if (textView != null && questContent.isManaged()) {
            FragmentQuestDetailBinding binding2 = getBinding();
            if (binding2 != null) {
                textView2 = binding2.titleView;
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setText(questContent.getText());
            }
            FragmentQuestDetailBinding binding3 = getBinding();
            if (binding3 != null && (textView3 = binding3.descriptionView) != null) {
                textView3.setText(StringExtensionsKt.fromHtml(androidx.core.text.b.a(MarkdownParser.INSTANCE.parseMarkdown(questContent.getNotes()), 0)), TextView.BufferType.SPANNABLE);
            }
            FragmentQuestDetailBinding binding4 = getBinding();
            if (binding4 != null && (pixelArtView = binding4.questScrollImageView) != null) {
                DataBindingUtilsKt.loadImage$default(pixelArtView, "inventory_quest_scroll_" + questContent.getKey(), null, 2, null);
            }
        }
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        q.z("socialRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getSocialRepository().close();
        getUserRepository().close();
        getInventoryRepository().close();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Button button;
        Button button2;
        Button button3;
        q.i(view, "view");
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        FragmentQuestDetailBinding binding = getBinding();
        if (binding != null && (button3 = binding.questBeginButton) != null) {
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QuestDetailFragment.onViewCreated$lambda$0(QuestDetailFragment.this, view2);
                }
            });
        }
        FragmentQuestDetailBinding binding2 = getBinding();
        if (binding2 != null && (button2 = binding2.questCancelButton) != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QuestDetailFragment.onViewCreated$lambda$1(QuestDetailFragment.this, view2);
                }
            });
        }
        FragmentQuestDetailBinding binding3 = getBinding();
        if (binding3 != null && (button = binding3.questLeaveButton) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.social.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    QuestDetailFragment.onViewCreated$lambda$2(QuestDetailFragment.this, view2);
                }
            });
        }
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new QuestDetailFragment$onViewCreated$4(this, null), 2, null);
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentQuestDetailBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentQuestDetailBinding inflate = FragmentQuestDetailBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentQuestDetailBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentQuestDetailBinding fragmentQuestDetailBinding) {
        this.binding = fragmentQuestDetailBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onQuestCancel$lambda$7$lambda$6(DialogInterface dialogInterface, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onQuestLeave$lambda$10(DialogInterface dialogInterface, int i10) {
    }
}
