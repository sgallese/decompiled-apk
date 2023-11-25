package com.habitrpg.android.habitica.ui.views.social;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ChatBarViewBinding;
import com.habitrpg.android.habitica.extensions.OnChangeTextWatcher;
import com.habitrpg.android.habitica.models.social.ChatMessage;
import com.habitrpg.android.habitica.ui.helpers.AutocompleteAdapter;
import com.habitrpg.android.habitica.ui.helpers.AutocompleteTokenizer;
import com.habitrpg.android.habitica.ui.views.HabiticaAutocompleteTextView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import dc.w;
import ec.t;
import java.util.List;
import qc.q;

/* compiled from: ChatBarView.kt */
/* loaded from: classes4.dex */
public final class ChatBarView extends LinearLayout {
    public static final int $stable = 8;
    private AutocompleteAdapter autocompleteAdapter;
    private String autocompleteContext;
    private final ChatBarViewBinding binding;
    private String groupID;
    private boolean hasAcceptedGuidelines;
    private long maxChatLength;
    private pc.a<w> onCommunityGuidelinesAccepted;
    private pc.l<? super String, w> sendAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBarView(Context context) {
        super(context);
        q.i(context, "context");
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        ChatBarViewBinding inflate = ChatBarViewBinding.inflate(ContextExtensionsKt.getLayoutInflater(context2), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.maxChatLength = 3000L;
        this.autocompleteContext = "";
        setupView();
    }

    private final void sendButtonPressed() {
        boolean z10;
        String message = getMessage();
        if (message.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.binding.chatEditText.setText((CharSequence) null);
            pc.l<? super String, w> lVar = this.sendAction;
            if (lVar != null) {
                lVar.invoke(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSendButtonEnabled(boolean z10) {
        int c10;
        if (z10) {
            Context context = getContext();
            q.h(context, "getContext(...)");
            c10 = ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent);
        } else {
            c10 = androidx.core.content.a.c(getContext(), R.color.disabled_background);
        }
        this.binding.sendButton.setColorFilter(c10);
        this.binding.sendButton.setEnabled(z10);
    }

    private final void setupView() {
        List l10;
        setOrientation(1);
        setBackgroundResource(R.color.content_background);
        this.binding.chatEditText.addTextChangedListener(new OnChangeTextWatcher(new ChatBarView$setupView$1(this)));
        this.binding.sendButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatBarView.setupView$lambda$0(ChatBarView.this, view);
            }
        });
        this.binding.chatEditText.setAdapter(this.autocompleteAdapter);
        this.binding.chatEditText.setThreshold(2);
        HabiticaAutocompleteTextView habiticaAutocompleteTextView = this.binding.chatEditText;
        l10 = t.l('@', ':');
        habiticaAutocompleteTextView.setTokenizer(new AutocompleteTokenizer(l10));
        this.binding.communityGuidelinesAcceptButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatBarView.setupView$lambda$1(ChatBarView.this, view);
            }
        });
        this.binding.communityGuidelinesReviewView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.views.social.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatBarView.setupView$lambda$2(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupView$lambda$0(ChatBarView chatBarView, View view) {
        q.i(chatBarView, "this$0");
        chatBarView.sendButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupView$lambda$1(ChatBarView chatBarView, View view) {
        q.i(chatBarView, "this$0");
        pc.a<w> aVar = chatBarView.onCommunityGuidelinesAccepted;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupView$lambda$2(View view) {
        MainNavigationController.navigate$default(MainNavigationController.INSTANCE, R.id.guidelinesActivity, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTextIndicator(String str) {
        int i10;
        if (this.binding.chatEditText.getLineCount() >= 3) {
            this.binding.textIndicator.setVisibility(0);
            this.binding.indicatorSpacing.setVisibility(0);
            this.binding.textIndicator.setText(str.length() + "/" + this.maxChatLength);
            if (str.length() > this.maxChatLength) {
                i10 = R.color.text_red;
            } else if (str.length() > this.maxChatLength * 0.95d) {
                i10 = R.color.text_yellow;
            } else {
                i10 = R.color.text_dimmed;
            }
            this.binding.textIndicator.setTextColor(androidx.core.content.a.c(getContext(), i10));
            return;
        }
        this.binding.textIndicator.setVisibility(8);
        this.binding.indicatorSpacing.setVisibility(8);
    }

    public final AutocompleteAdapter getAutocompleteAdapter() {
        return this.autocompleteAdapter;
    }

    public final String getAutocompleteContext() {
        return this.autocompleteContext;
    }

    public final List<ChatMessage> getChatMessages() {
        List<ChatMessage> i10;
        List<ChatMessage> chatMessages;
        AutocompleteAdapter autocompleteAdapter = this.autocompleteAdapter;
        if (autocompleteAdapter == null || (chatMessages = autocompleteAdapter.getChatMessages()) == null) {
            i10 = t.i();
            return i10;
        }
        return chatMessages;
    }

    public final String getGroupID() {
        return this.groupID;
    }

    public final boolean getHasAcceptedGuidelines() {
        return this.hasAcceptedGuidelines;
    }

    public final long getMaxChatLength$Habitica_2311256681_prodRelease() {
        return this.maxChatLength;
    }

    public final String getMessage() {
        return this.binding.chatEditText.getText().toString();
    }

    public final pc.a<w> getOnCommunityGuidelinesAccepted() {
        return this.onCommunityGuidelinesAccepted;
    }

    public final pc.l<String, w> getSendAction() {
        return this.sendAction;
    }

    public final void setAutocompleteAdapter(AutocompleteAdapter autocompleteAdapter) {
        this.autocompleteAdapter = autocompleteAdapter;
    }

    public final void setAutocompleteContext(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.autocompleteContext = str;
        AutocompleteAdapter autocompleteAdapter = this.autocompleteAdapter;
        if (autocompleteAdapter != null) {
            autocompleteAdapter.setAutocompleteContext(str);
        }
    }

    public final void setChatMessages(List<? extends ChatMessage> list) {
        q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        AutocompleteAdapter autocompleteAdapter = this.autocompleteAdapter;
        if (autocompleteAdapter != null) {
            autocompleteAdapter.setChatMessages(list);
        }
    }

    public final void setGroupID(String str) {
        this.groupID = str;
        AutocompleteAdapter autocompleteAdapter = this.autocompleteAdapter;
        if (autocompleteAdapter != null) {
            autocompleteAdapter.setGroupID(str);
        }
    }

    public final void setHasAcceptedGuidelines(boolean z10) {
        this.hasAcceptedGuidelines = z10;
        if (z10) {
            this.binding.communityGuidelinesView.setVisibility(8);
            this.binding.chatBarContent.setVisibility(0);
            return;
        }
        this.binding.chatBarContent.setVisibility(8);
    }

    public final void setMaxChatLength$Habitica_2311256681_prodRelease(long j10) {
        this.maxChatLength = j10;
    }

    public final void setMessage(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.binding.chatEditText.setText(str, TextView.BufferType.EDITABLE);
    }

    public final void setOnCommunityGuidelinesAccepted(pc.a<w> aVar) {
        this.onCommunityGuidelinesAccepted = aVar;
    }

    public final void setSendAction(pc.l<? super String, w> lVar) {
        this.sendAction = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        Context context2 = getContext();
        q.h(context2, "getContext(...)");
        ChatBarViewBinding inflate = ChatBarViewBinding.inflate(ContextExtensionsKt.getLayoutInflater(context2), this);
        q.h(inflate, "inflate(...)");
        this.binding = inflate;
        this.maxChatLength = 3000L;
        this.autocompleteContext = "";
        setupView();
    }
}
