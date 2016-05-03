package spring4Template.users.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring4Template.users.service.UserGroupService;
import spring4Template.users.ws.schema.UserGroupsResponse;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "ws/users/groups")
public class UserGroupWebService {

    @Autowired private UserGroupService userGroupService;

    @RequestMapping(method = GET)
    public UserGroupsResponse list() {
        UserGroupsResponse response = new UserGroupsResponse();
        response.setUserGroups(userGroupService.getUserGroups());
        return response;
    }

}