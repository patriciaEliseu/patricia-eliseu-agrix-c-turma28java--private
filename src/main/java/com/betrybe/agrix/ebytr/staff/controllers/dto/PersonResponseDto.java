package com.betrybe.agrix.ebytr.staff.controllers.dto;

import com.betrybe.agrix.ebytr.staff.security.Role;


/**
 * Record.
 */


public record PersonResponseDto(Long id, String username, Role role) {
}
