package com.habitrpg.android.habitica.ui.fragments;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.FragmentReportMessageBinding;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;

/* compiled from: ReportBottomSheetFragment.kt */
/* loaded from: classes4.dex */
public final class ReportBottomSheetFragment extends Hilt_ReportBottomSheetFragment {
    private static final String DISPLAY_NAME = "display_name";
    private static final String GROUP_ID = "group_id";
    private static final String MESSAGE_ID = "message_id";
    private static final String MESSAGE_TEXT = "message_text";
    private static final String PROFILE_NAME = "profile_name";
    private static final String REPORTING_USER_ID = "reporting_user_id";
    private static final String REPORT_TYPE = "report_type";
    public static final String REPORT_TYPE_MESSAGE = "report_type_message";
    public static final String REPORT_TYPE_USER = "report_type_user";
    private static final String SOURCE_VIEW = "source_view";
    public static final String TAG = "ReportBottomSheetFragment";
    private FragmentReportMessageBinding binding;
    private String displayName;
    private String groupID;
    private boolean isReporting;
    private String messageID;
    private String messageText;
    private String profileName;
    private String reportType;
    private String reportingUserId;
    public SocialRepository socialRepository;
    private String source;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReportBottomSheetFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public static /* synthetic */ ReportBottomSheetFragment newInstance$default(Companion companion, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
            String str9;
            String str10;
            String str11;
            if ((i10 & 2) != 0) {
                str9 = "";
            } else {
                str9 = str2;
            }
            if ((i10 & 4) != 0) {
                str10 = "";
            } else {
                str10 = str3;
            }
            if ((i10 & 16) != 0) {
                str11 = "";
            } else {
                str11 = str5;
            }
            return companion.newInstance(str, str9, str10, str4, str11, str6, str7, str8);
        }

        public final ReportBottomSheetFragment newInstance(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            qc.q.i(str, "reportType");
            qc.q.i(str2, "profileName");
            qc.q.i(str3, "displayName");
            qc.q.i(str4, "userIdBeingReported");
            qc.q.i(str5, "messageId");
            qc.q.i(str6, "messageText");
            qc.q.i(str7, TaskFormActivity.GROUP_ID_KEY);
            qc.q.i(str8, "sourceView");
            Bundle bundle = new Bundle();
            bundle.putString(ReportBottomSheetFragment.REPORT_TYPE, str);
            bundle.putString(ReportBottomSheetFragment.PROFILE_NAME, str2);
            bundle.putString(ReportBottomSheetFragment.DISPLAY_NAME, str3);
            bundle.putString(ReportBottomSheetFragment.REPORTING_USER_ID, str4);
            bundle.putString(ReportBottomSheetFragment.MESSAGE_ID, str5);
            bundle.putString(ReportBottomSheetFragment.MESSAGE_TEXT, str6);
            bundle.putString(ReportBottomSheetFragment.GROUP_ID, str7);
            bundle.putString(ReportBottomSheetFragment.SOURCE_VIEW, str8);
            ReportBottomSheetFragment reportBottomSheetFragment = new ReportBottomSheetFragment();
            reportBottomSheetFragment.setArguments(bundle);
            return reportBottomSheetFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$0(DialogInterface dialogInterface) {
        qc.q.i(dialogInterface, "dialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        aVar.getBehavior().P0(3);
        aVar.getBehavior().C0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(ReportBottomSheetFragment reportBottomSheetFragment, View view) {
        qc.q.i(reportBottomSheetFragment, "this$0");
        if (qc.q.d(reportBottomSheetFragment.reportType, REPORT_TYPE_MESSAGE)) {
            reportBottomSheetFragment.reportMessage();
        } else if (qc.q.d(reportBottomSheetFragment.reportType, REPORT_TYPE_USER)) {
            reportBottomSheetFragment.reportUser();
        }
    }

    private final void reportMessage() {
        if (this.isReporting) {
            return;
        }
        this.isReporting = true;
        if (this.messageID != null) {
            ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine(new ReportBottomSheetFragment$reportMessage$1$1(this)), null, new ReportBottomSheetFragment$reportMessage$1$2(this, null), 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void reportUser() {
        /*
            r5 = this;
            boolean r0 = r5.isReporting
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = r5.reportingUserId
            r1 = 1
            if (r0 == 0) goto L13
            boolean r2 = yc.m.u(r0)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            if (r2 == 0) goto L17
            return
        L17:
            r5.isReporting = r1
            androidx.lifecycle.q r2 = androidx.lifecycle.w.a(r5)
            com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment$reportUser$1 r3 = new com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment$reportUser$1
            r4 = 0
            r3.<init>(r5, r0, r4)
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r2, r4, r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment.reportUser():void");
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.y, androidx.fragment.app.k
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        qc.q.g(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.habitrpg.android.habitica.ui.fragments.u
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ReportBottomSheetFragment.onCreateDialog$lambda$0(dialogInterface);
            }
        });
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        FragmentReportMessageBinding inflate = FragmentReportMessageBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i10;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        FragmentReportMessageBinding fragmentReportMessageBinding = null;
        if (arguments != null) {
            str = arguments.getString(REPORT_TYPE);
        } else {
            str = null;
        }
        this.reportType = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString(MESSAGE_ID);
        } else {
            str2 = null;
        }
        this.messageID = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString(GROUP_ID);
        } else {
            str3 = null;
        }
        this.groupID = str3;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str4 = arguments4.getString(MESSAGE_TEXT);
        } else {
            str4 = null;
        }
        this.messageText = str4;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str5 = arguments5.getString(PROFILE_NAME);
        } else {
            str5 = null;
        }
        this.profileName = str5;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            str6 = arguments6.getString(DISPLAY_NAME);
        } else {
            str6 = null;
        }
        this.displayName = str6;
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            str7 = arguments7.getString(REPORTING_USER_ID);
        } else {
            str7 = null;
        }
        this.reportingUserId = str7;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            str8 = arguments8.getString(SOURCE_VIEW);
        } else {
            str8 = null;
        }
        this.source = str8;
        FragmentReportMessageBinding fragmentReportMessageBinding2 = this.binding;
        if (fragmentReportMessageBinding2 == null) {
            qc.q.z("binding");
            fragmentReportMessageBinding2 = null;
        }
        TextView textView = fragmentReportMessageBinding2.messageTextView;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            str9 = arguments9.getString(this.messageText);
        } else {
            str9 = null;
        }
        textView.setText(str9);
        FragmentReportMessageBinding fragmentReportMessageBinding3 = this.binding;
        if (fragmentReportMessageBinding3 == null) {
            qc.q.z("binding");
            fragmentReportMessageBinding3 = null;
        }
        fragmentReportMessageBinding3.reportButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ReportBottomSheetFragment.onViewCreated$lambda$1(ReportBottomSheetFragment.this, view2);
            }
        });
        if (qc.q.d(this.reportType, REPORT_TYPE_USER)) {
            FragmentReportMessageBinding fragmentReportMessageBinding4 = this.binding;
            if (fragmentReportMessageBinding4 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding4 = null;
            }
            fragmentReportMessageBinding4.toolbarTitle.setText(getString(R.string.report_player));
            FragmentReportMessageBinding fragmentReportMessageBinding5 = this.binding;
            if (fragmentReportMessageBinding5 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding5 = null;
            }
            int i11 = 0;
            fragmentReportMessageBinding5.additionalExplanationTextview.setVisibility(0);
            FragmentReportMessageBinding fragmentReportMessageBinding6 = this.binding;
            if (fragmentReportMessageBinding6 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding6 = null;
            }
            fragmentReportMessageBinding6.additionalInfoEdittext.setHint(getString(R.string.report_hint));
            FragmentReportMessageBinding fragmentReportMessageBinding7 = this.binding;
            if (fragmentReportMessageBinding7 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding7 = null;
            }
            TextView textView2 = fragmentReportMessageBinding7.additionalExplanationTextview;
            qc.q.h(textView2, "additionalExplanationTextview");
            MarkdownParserKt.setMarkdown(textView2, getString(R.string.report_user_description, this.profileName));
            FragmentReportMessageBinding fragmentReportMessageBinding8 = this.binding;
            if (fragmentReportMessageBinding8 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding8 = null;
            }
            TextView textView3 = fragmentReportMessageBinding8.reportExplanationTextview;
            qc.q.h(textView3, "reportExplanationTextview");
            MarkdownParserKt.setMarkdown(textView3, getString(R.string.report_user_explanation));
            String string = getString(R.string.report_formatted_name, this.displayName, this.profileName);
            qc.q.h(string, "getString(...)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            TypefaceSpan typefaceSpan = new TypefaceSpan("sans-serif-medium");
            String str10 = this.displayName;
            if (str10 != null) {
                i10 = str10.length();
            } else {
                i10 = 0;
            }
            spannableStringBuilder.setSpan(typefaceSpan, 0, i10, 33);
            TypefaceSpan typefaceSpan2 = new TypefaceSpan("sans-serif");
            String str11 = this.displayName;
            if (str11 != null) {
                i11 = str11.length();
            }
            spannableStringBuilder.setSpan(typefaceSpan2, i11, string.length(), 33);
            FragmentReportMessageBinding fragmentReportMessageBinding9 = this.binding;
            if (fragmentReportMessageBinding9 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding9 = null;
            }
            fragmentReportMessageBinding9.messageTextView.setText(spannableStringBuilder);
            FragmentReportMessageBinding fragmentReportMessageBinding10 = this.binding;
            if (fragmentReportMessageBinding10 == null) {
                qc.q.z("binding");
            } else {
                fragmentReportMessageBinding = fragmentReportMessageBinding10;
            }
            fragmentReportMessageBinding.reportReasonTitle.setText(getString(R.string.report_reason_title_player));
        } else if (qc.q.d(this.reportType, REPORT_TYPE_MESSAGE)) {
            FragmentReportMessageBinding fragmentReportMessageBinding11 = this.binding;
            if (fragmentReportMessageBinding11 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding11 = null;
            }
            fragmentReportMessageBinding11.toolbarTitle.setText(getString(R.string.report_message));
            FragmentReportMessageBinding fragmentReportMessageBinding12 = this.binding;
            if (fragmentReportMessageBinding12 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding12 = null;
            }
            fragmentReportMessageBinding12.additionalExplanationTextview.setVisibility(8);
            FragmentReportMessageBinding fragmentReportMessageBinding13 = this.binding;
            if (fragmentReportMessageBinding13 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding13 = null;
            }
            fragmentReportMessageBinding13.additionalInfoEdittext.setHint(getString(R.string.report_message_hint));
            FragmentReportMessageBinding fragmentReportMessageBinding14 = this.binding;
            if (fragmentReportMessageBinding14 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding14 = null;
            }
            TextView textView4 = fragmentReportMessageBinding14.reportExplanationTextview;
            qc.q.h(textView4, "reportExplanationTextview");
            MarkdownParserKt.setMarkdown(textView4, getString(R.string.report_message_explanation));
            FragmentReportMessageBinding fragmentReportMessageBinding15 = this.binding;
            if (fragmentReportMessageBinding15 == null) {
                qc.q.z("binding");
                fragmentReportMessageBinding15 = null;
            }
            fragmentReportMessageBinding15.messageTextView.setText(this.messageText);
            FragmentReportMessageBinding fragmentReportMessageBinding16 = this.binding;
            if (fragmentReportMessageBinding16 == null) {
                qc.q.z("binding");
            } else {
                fragmentReportMessageBinding = fragmentReportMessageBinding16;
            }
            fragmentReportMessageBinding.reportReasonTitle.setText(getString(R.string.report_reason_title_message));
        }
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }
}
