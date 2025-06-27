== API implementation
The following list shows which methods are implemented in JTrello API wrapper and where.

 |Method|Where| 
 |**Actions**|| 
 |GET /1/actions/[action_id]|ActionService.get| 
 |GET /1/actions/[action_id]/[field]|| 
 |GET /1/actions/[action_id]/board|| 
 |GET /1/actions/[action_id]/board/[field]|| 
 |GET /1/actions/[action_id]/card|| 
 |GET /1/actions/[action_id]/card/[field]|| 
 |GET /1/actions/[action_id]/list|| 
 |GET /1/actions/[action_id]/list/[field]|| 
 |GET /1/actions/[action_id]/member|| 
 |GET /1/actions/[action_id]/member/[field]|| 
 |GET /1/actions/[action_id]/memberCreator|| 
 |GET /1/actions/[action_id]/memberCreator/[field]|| 
 |GET /1/actions/[action_id]/organization|| 
 |GET /1/actions/[action_id]/organization/[field]|| 
 |**Boards**|| 
 |GET /1/boards/[board_id]|BoardService.get| 
 |GET /1/boards/[board_id]/[field]|| 
 |GET /1/boards/[board_id]/actions|ActionService.getByBoard| 
 |GET /1/boards/[board_id]/cards|CardService.getByBoard| 
 |GET /1/boards/[board_id]/cards/[filter]|| 
 |GET /1/boards/[board_id]/cards/[idCard]|| 
 |GET /1/boards/[board_id]/checklists|| 
 |GET /1/boards/[board_id]/lists|ListService.getByBoard| 
 |GET /1/boards/[board_id]/lists/[filter]|| 
 |GET /1/boards/[board_id]/members|MemberService.getByBoard| 
 |GET /1/boards/[board_id]/members/[filter]|| 
 |GET /1/boards/[board_id]/membersInvited|| 
 |GET /1/boards/[board_id]/membersInvited/[field]|| 
 |GET /1/boards/[board_id]/myPrefs|| 
 |GET /1/boards/[board_id]/organization|| 
 |GET /1/boards/[board_id]/organization/[field]|| 
 |PUT /1/boards/[board_id]|| 
 |PUT /1/boards/[board_id]/closed|| 
 |PUT /1/boards/[board_id]/desc|| 
 |PUT /1/boards/[board_id]/name|| 
 |POST /1/boards|BoardService.create| 
 |POST /1/boards/[board_id]/checklists|| 
 |POST /1/boards/[board_id]/lists|| 
 |POST /1/boards/[board_id]/myPrefs|| 
 |**Cards**|| 
 |GET /1/cards/[card_id]|CardService.get| 
 |GET /1/cards/[card_id]/[field]|| 
 |GET /1/cards/[card_id]/actions|ActionService.getByCard| 
 |GET /1/cards/[card_id]/attachments|| 
 |GET /1/cards/[card_id]/board|| 
 |GET /1/cards/[card_id]/board/[field]|| 
 |GET /1/cards/[card_id]/checkItemStates|| 
 |GET /1/cards/[card_id]/checklists|ChecklistService.getByCard| 
 |GET /1/cards/[card_id]/list|| 
 |GET /1/cards/[card_id]/list/[field]|| 
 |GET /1/cards/[card_id]/members|MemberService.getByCard| 
 |PUT /1/cards/[card_id]|| 
 |PUT /1/cards/[card_id]/closed|| 
 |PUT /1/cards/[card_id]/desc|| 
 |PUT /1/cards/[card_id]/due|| 
 |PUT /1/cards/[card_id]/idList|| 
 |PUT /1/cards/[card_id]/name|| 
 |POST /1/cards|CardService.create| 
 |POST /1/cards/[card_id]/actions/comments|| 
 |POST /1/cards/[card_id]/attachments|| 
 |POST /1/cards/[card_id]/checklists|| 
 |POST /1/cards/[card_id]/labels|| 
 |POST /1/cards/[card_id]/members|| 
 |POST /1/cards/[card_id]/membersVoted|| 
 |DELETE /1/cards/[card_id]|| 
 |DELETE /1/cards/[card_id]/checklists/[idChecklist]|| 
 |DELETE /1/cards/[card_id]/labels/[color]|| 
 |DELETE /1/cards/[card_id]/members/[idMember]|| 
 |DELETE /1/cards/[card_id]/membersVoted/[idMember]|| 
 |**Checklists**|| 
 |GET /1/checklists/[checklist_id]|ChecklistService.get| 
 |GET /1/checklists/[checklist_id]/[field]|| 
 |GET /1/checklists/[checklist_id]/board|| 
 |GET /1/checklists/[checklist_id]/board/[field]|| 
 |GET /1/checklists/[checklist_id]/cards|| 
 |GET /1/checklists/[checklist_id]/cards/[filter]|| 
 |GET /1/checklists/[checklist_id]/checkItems|| 
 |PUT /1/checklists/[checklist_id]|| 
 |PUT /1/checklists/[checklist_id]/name|| 
 |POST /1/checklists|ChecklistService.create| 
 |POST /1/checklists/[checklist_id]/checkItems|| 
 |DELETE /1/checklists/[checklist_id]/checkItems/[idCheckItem]|| 
 |**Lists**|| 
 |GET /1/lists/[list_id]|ListService.get| 
 |GET /1/lists/[list_id]/[field]|| 
 |GET /1/lists/[list_id]/actions|ActionService.getList| 
 |GET /1/lists/[list_id]/board|| 
 |GET /1/lists/[list_id]/board/[field]|| 
 |GET /1/lists/[list_id]/cards|| 
 |GET /1/lists/[list_id]/cards/[filter]|| 
 |PUT /1/lists/[list_id]|| 
 |PUT /1/lists/[list_id]/closed|| 
 |PUT /1/lists/[list_id]/name|| 
 |POST /1/lists|ListService.create| 
 |POST /1/lists/[list_id]/cards|| 
 |**Members**|| 
 |GET /1/members/[member_id or username]|MemberService.get| 
 |GET /1/members/[member_id or username]/[field]|| 
 |GET /1/members/[member_id or username]/actions|ActionService.getUser| 
 |GET /1/members/[member_id or username]/boards|BoardService.getByUser| 
 |GET /1/members/[member_id or username]/boards/[filter]|| 
 |GET /1/members/[member_id or username]/boardsInvited|| 
 |GET /1/members/[member_id or username]/boardsInvited/[field]|| 
 |GET /1/members/[member_id or username]/cards|CardService.getByUser| 
 |GET /1/members/[member_id or username]/cards/[filter]|| 
 |GET /1/members/[member_id or username]/notifications|NotificationService.getByUser| 
 |GET /1/members/[member_id or username]/notifications/[filter]|| 
 |GET /1/members/[member_id or username]/organizations|OrganizationService.getByUser| 
 |GET /1/members/[member_id or username]/organizations/[filter]|| 
 |GET /1/members/[member_id or username]/organizationsInvited|| 
 |GET /1/members/[member_id or username]/organizationsInvited/[field]|| 
 |PUT /1/members/[member_id or username]|| 
 |PUT /1/members/[member_id or username]/bio|| 
 |PUT /1/members/[member_id or username]/fullName|| 
 |PUT /1/members/[member_id or username]/initials|| 
 |**Notifications**|| 
 |GET /1/notifications/[notification_id]|NotificationService.get| 
 |GET /1/notifications/[notification_id]/[field]|| 
 |GET /1/notifications/[notification_id]/board|| 
 |GET /1/notifications/[notification_id]/board/[field]|| 
 |GET /1/notifications/[notification_id]/card|| 
 |GET /1/notifications/[notification_id]/card/[field]|| 
 |GET /1/notifications/[notification_id]/list|| 
 |GET /1/notifications/[notification_id]/list/[field]|| 
 |GET /1/notifications/[notification_id]/member|| 
 |GET /1/notifications/[notification_id]/member/[field]|| 
 |GET /1/notifications/[notification_id]/memberCreator|| 
 |GET /1/notifications/[notification_id]/memberCreator/[field]|| 
 |GET /1/notifications/[notification_id]/organization|| 
 |GET /1/notifications/[notification_id]/organization/[field]|| 
 |**Organizations**|| 
 |GET /1/organizations/[org_id or name]|OrganizationService.get| 
 |GET /1/organizations/[org_id or name]/[field]|| 
 |GET /1/organizations/[org_id or name]/actions|ActionService.getOrganization| 
 |GET /1/organizations/[org_id or name]/boards|BoardService.getByOrganization| 
 |GET /1/organizations/[org_id or name]/boards/[filter]|| 
 |GET /1/organizations/[org_id or name]/members|MemberService.getByOrganization| 
 |GET /1/organizations/[org_id or name]/members/[filter]|| 
 |PUT /1/organizations/[org_id or name]|| 
 |PUT /1/organizations/[org_id or name]/desc|| 
 |PUT /1/organizations/[org_id or name]/displayName|| 
 |PUT /1/organizations/[org_id or name]/name|| 
 |PUT /1/organizations/[org_id or name]/website|| 
 |POST /1/organizations|OrganizationService.create| 
 |DELETE /1/organizations/[org_id or name]|| 
 |**Tokens**|| 
 |GET /1/tokens/[token]|| 
 |GET /1/tokens/[token]/[field]|| 
 |GET /1/tokens/[token]/member|| 
 |GET /1/tokens/[token]/member/[field]|| 
 |**Types**|| 
 |GET /1/types/[id]|| 
